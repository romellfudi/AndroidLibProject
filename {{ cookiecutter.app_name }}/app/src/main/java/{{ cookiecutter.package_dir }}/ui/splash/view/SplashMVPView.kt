package {{ cookiecutter.package_name }}.ui.splash.view

import {{ cookiecutter.package_name }}.ui.base.view.MVPView

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface SplashMVPView : MVPView {

    fun showSuccessToast()
    fun showErrorToast()
    fun openMainActivity()
    fun openLoginActivity()
}