package {{ cookiecutter.package_name }}.ui.rate.presenter

import {{ cookiecutter.package_name }}.ui.base.presenter.BasePresenter
import {{ cookiecutter.package_name }}.ui.rate.interactor.RateUsMVPInterator
import {{ cookiecutter.package_name }}.ui.rate.view.RateUsDialogMVPView
import {{ cookiecutter.package_name }}.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class RateUsPresenter<V : RateUsDialogMVPView, I : RateUsMVPInterator> @Inject internal constructor(interator: I, schedulerProvider: SchedulerProvider, compositeDisposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interator, schedulerProvider = schedulerProvider, compositeDisposable = compositeDisposable), RateUsMVPPresenter<V, I> {

    override fun onLaterOptionClicked() = getView()?.let { it.dismissDialog() }

    override fun onSubmitOptionClicked() = interactor?.let {
        it.submitRating()
        getView()?.let {
            it.showRatingSubmissionSuccessMessage()
            it.dismissDialog()
        }
    }
}
