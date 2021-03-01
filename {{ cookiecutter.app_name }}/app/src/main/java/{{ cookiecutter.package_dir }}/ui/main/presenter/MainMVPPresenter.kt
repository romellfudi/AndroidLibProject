package {{ cookiecutter.package_name }}.ui.main.presenter

import {{ cookiecutter.package_name }}.ui.base.presenter.MVPPresenter
import {{ cookiecutter.package_name }}.ui.main.interactor.MainMVPInteractor
import {{ cookiecutter.package_name }}.ui.main.view.MainMVPView

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface MainMVPPresenter<V : MainMVPView, I : MainMVPInteractor> : MVPPresenter<V, I> {

    fun refreshQuestionCards(): Boolean?
    fun onDrawerOptionAboutClick() : Unit?
    fun onDrawerOptionRateUsClick(): Unit?
    fun onDrawerOptionFeedClick(): Unit?
    fun onDrawerOptionLogoutClick()

}