package {{ cookiecutter.package_name }}.data.preferences

import {{ cookiecutter.package_name }}.util.AppConstants

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface PreferenceHelper {

    fun getCurrentUserLoggedInMode(): Int

    fun setCurrentUserLoggedInMode(mode: AppConstants.LoggedInMode)

    fun getCurrentUserId(): Long?

    fun setCurrentUserId(userId: Long?)

    fun getCurrentUserName(): String

    fun setCurrentUserName(userName: String?)

    fun getCurrentUserEmail(): String?

    fun setCurrentUserEmail(email: String?)

    fun getAccessToken(): String?

    fun setAccessToken(accessToken: String?)

}