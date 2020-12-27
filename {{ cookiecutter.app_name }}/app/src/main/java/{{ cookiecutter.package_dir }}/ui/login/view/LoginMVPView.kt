package {{ cookiecutter.package_name }}.ui.login.view

import {{ cookiecutter.package_name }}.ui.base.view.MVPView

/**
 * Created by jyotidubey on 10/01/18.
 */
interface LoginMVPView : MVPView {

    fun showValidationMessage(errorCode: Int)
    fun openMainActivity()
}