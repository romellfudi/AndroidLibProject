package {{ cookiecutter.package_name }}.ui.splash.view

import {{ cookiecutter.package_name }}.ui.base.view.MVPView

/**
 * Created by jyotidubey on 04/01/18.
 */
interface SplashMVPView : MVPView {

    fun showSuccessToast()
    fun showErrorToast()
    fun openMainActivity()
    fun openLoginActivity()
}