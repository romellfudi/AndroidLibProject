package {{ cookiecutter.package_name }}.ui.base.interactor

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface MVPInteractor {

    fun isUserLoggedIn(): Boolean

    fun performUserLogout()

}