package {{ cookiecutter.package_name }}.ui.login.interactor

import {{ cookiecutter.package_name }}.data.network.LoginResponse
import {{ cookiecutter.package_name }}.ui.base.interactor.MVPInteractor
import {{ cookiecutter.package_name }}.util.AppConstants
import io.reactivex.Observable

/**
 * Created by jyotidubey on 10/01/18.
 */
interface LoginMVPInteractor : MVPInteractor {

    fun doServerLoginApiCall(email: String, password: String): Observable<LoginResponse>

    fun doFBLoginApiCall(): Observable<LoginResponse>

    fun doGoogleLoginApiCall(): Observable<LoginResponse>

    fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode)

}