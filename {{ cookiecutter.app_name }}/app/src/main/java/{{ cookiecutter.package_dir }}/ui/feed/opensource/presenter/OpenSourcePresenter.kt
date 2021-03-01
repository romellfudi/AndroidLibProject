package {{ cookiecutter.package_name }}.ui.feed.opensource.presenter

import {{ cookiecutter.package_name }}.ui.base.presenter.BasePresenter
import {{ cookiecutter.package_name }}.ui.feed.opensource.interactor.OpenSourceMVPInteractor
import {{ cookiecutter.package_name }}.ui.feed.opensource.view.OpenSourceMVPView
import {{ cookiecutter.package_name }}.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class OpenSourcePresenter<V : OpenSourceMVPView, I : OpenSourceMVPInteractor> @Inject constructor(interactor: I, schedulerProvider: SchedulerProvider, compositeDisposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = compositeDisposable), OpenSourceMVPPresenter<V, I> {

    override fun onViewPrepared() {
        getView()?.showProgress()
        interactor?.let {
            compositeDisposable.add(it.getOpenSourceList()
                    .compose(schedulerProvider.ioToMainObservableScheduler())
                    .subscribe { openSourceResponse ->
                        getView()?.let {
                            it.hideProgress()
                            it.displayOpenSourceList(openSourceResponse.data)
                        }
                    })
        }

    }
}