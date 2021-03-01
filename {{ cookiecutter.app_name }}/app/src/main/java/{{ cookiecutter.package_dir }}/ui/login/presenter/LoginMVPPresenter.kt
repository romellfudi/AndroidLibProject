package {{ cookiecutter.package_name }}.ui.login.presenter

import {{ cookiecutter.package_name }}.ui.base.presenter.MVPPresenter
import {{ cookiecutter.package_name }}.ui.login.interactor.LoginMVPInteractor
import {{ cookiecutter.package_name }}.ui.login.view.LoginMVPView

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface LoginMVPPresenter<V : LoginMVPView, I : LoginMVPInteractor> : MVPPresenter<V, I> {

    fun onServerLoginClicked(email: String, password: String)
    fun onFBLoginClicked()
    fun onGoogleLoginClicked()

}