package {{ cookiecutter.package_name }}.data.network

import {{ cookiecutter.package_name }}.BuildConfig

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
object ApiEndPoint {

    val ENDPOINT_GOOGLE_LOGIN = BuildConfig.BASE_URL + "/588d14f4100000a9072d2943"
    val ENDPOINT_FACEBOOK_LOGIN = BuildConfig.BASE_URL + "/588d15d3100000ae072d2944"
    val ENDPOINT_SERVER_LOGIN = BuildConfig.BASE_URL + "/588d15f5100000a8072d2945"
    val ENDPOINT_LOGOUT = BuildConfig.BASE_URL + "/588d161c100000a9072d2946"
    val ENDPOINT_BLOG = BuildConfig.BASE_URL + "/5926ce9d11000096006ccb30"
    val ENDPOINT_OPEN_SOURCE = BuildConfig.BASE_URL + "/5926c34212000035026871cd"

}