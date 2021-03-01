package {{ cookiecutter.package_name }}.data.network

import io.reactivex.Observable

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface ApiHelper {

    fun performServerLogin(request: LoginRequest.ServerLoginRequest): Observable<LoginResponse>

    fun performFBLogin(request: LoginRequest.FacebookLoginRequest): Observable<LoginResponse>

    fun performGoogleLogin(request: LoginRequest.GoogleLoginRequest): Observable<LoginResponse>

    fun performLogoutApiCall(): Observable<LogoutResponse>

    fun getBlogApiCall(): Observable<BlogResponse>

    fun getOpenSourceApiCall(): Observable<OpenSourceResponse>

}