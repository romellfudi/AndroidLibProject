package {{ cookiecutter.package_name }}.ui.login.interactor

import {{ cookiecutter.package_name }}.data.network.LoginResponse
import {{ cookiecutter.package_name }}.ui.base.interactor.MVPInteractor
import {{ cookiecutter.package_name }}.util.AppConstants
import io.reactivex.Observable

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface LoginMVPInteractor : MVPInteractor {

    fun doServerLoginApiCall(email: String, password: String): Observable<LoginResponse>

    fun doFBLoginApiCall(): Observable<LoginResponse>

    fun doGoogleLoginApiCall(): Observable<LoginResponse>

    fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode)

}