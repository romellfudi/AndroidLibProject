package {{ cookiecutter.package_name }}.ui.feed.blog.presenter

import {{ cookiecutter.package_name }}.ui.base.presenter.BasePresenter
import {{ cookiecutter.package_name }}.ui.feed.blog.interactor.BlogMVPInteractor
import {{ cookiecutter.package_name }}.ui.feed.blog.view.BlogMVPView
import {{ cookiecutter.package_name }}.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class BlogPresenter<V : BlogMVPView, I : BlogMVPInteractor> @Inject constructor(interactor: I, schedulerProvider: SchedulerProvider, compositeDisposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = compositeDisposable), BlogMVPPresenter<V, I> {

    override fun onViewPrepared() {
        getView()?.showProgress()
        interactor?.let {
            it.getBlogList()
                    .compose(schedulerProvider.ioToMainObservableScheduler())
                    .subscribe { blogResponse ->
                        getView()?.let {
                            it.hideProgress()
                            it.displayBlogList(blogResponse.data)
                        }
                    }
        }
    }
}