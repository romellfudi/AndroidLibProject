package {{ cookiecutter.package_name }}.ui.login.interactor

import {{ cookiecutter.package_name }}.data.network.ApiHelper
import {{ cookiecutter.package_name }}.data.network.LoginRequest
import {{ cookiecutter.package_name }}.data.network.LoginResponse
import {{ cookiecutter.package_name }}.data.preferences.PreferenceHelper
import {{ cookiecutter.package_name }}.ui.base.interactor.BaseInteractor
import {{ cookiecutter.package_name }}.util.AppConstants
import javax.inject.Inject

/**
 * Created by jyotidubey on 10/01/18.
 */
class LoginInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), LoginMVPInteractor {

    override fun doGoogleLoginApiCall() =
            apiHelper.performGoogleLogin(LoginRequest.GoogleLoginRequest("test1", "test1"))

    override fun doFBLoginApiCall() =
            apiHelper.performFBLogin(LoginRequest.FacebookLoginRequest("test3", "test4"))


    override fun doServerLoginApiCall(email: String, password: String) =
            apiHelper.performServerLogin(LoginRequest.ServerLoginRequest(email = email, password = password))


    override fun updateUserInSharedPref(loginResponse: LoginResponse, loggedInMode: AppConstants.LoggedInMode) =
            preferenceHelper.let {
                it.setCurrentUserId(loginResponse.userId)
                it.setAccessToken(loginResponse.accessToken)
                it.setCurrentUserLoggedInMode(loggedInMode)
            }
}