package {{ cookiecutter.package_name }}.ui.rate.presenter

import {{ cookiecutter.package_name }}.ui.base.presenter.MVPPresenter
import {{ cookiecutter.package_name }}.ui.rate.interactor.RateUsMVPInterator
import {{ cookiecutter.package_name }}.ui.rate.view.RateUsDialogMVPView

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface RateUsMVPPresenter<V : RateUsDialogMVPView, I : RateUsMVPInterator> : MVPPresenter<V, I> {

    fun onLaterOptionClicked() : Unit?
    fun onSubmitOptionClicked() : Unit?
}