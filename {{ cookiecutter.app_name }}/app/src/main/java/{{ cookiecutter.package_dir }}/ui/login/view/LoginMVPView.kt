package {{ cookiecutter.package_name }}.ui.login.view

import {{ cookiecutter.package_name }}.ui.base.view.MVPView

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface LoginMVPView : MVPView {

    fun showValidationMessage(errorCode: Int)
    fun openMainActivity()
}