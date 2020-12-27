package {{ cookiecutter.package_name }}.ui.splash.view

import android.content.Intent
import android.os.Bundle
import {{ cookiecutter.package_name }}.R
import {{ cookiecutter.package_name }}.ui.base.view.BaseActivity
import {{ cookiecutter.package_name }}.ui.login.view.LoginActivity
import {{ cookiecutter.package_name }}.ui.main.view.MainActivity
import {{ cookiecutter.package_name }}.ui.splash.interactor.SplashMVPInteractor
import {{ cookiecutter.package_name }}.ui.splash.presenter.SplashMVPPresenter
import javax.inject.Inject

class SplashMVPActivity : BaseActivity(), SplashMVPView {

    @Inject
    lateinit var presenter: SplashMVPPresenter<SplashMVPView, SplashMVPInteractor>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        presenter.onAttach(this)
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onFragmentDetached(tag: String) {
    }

    override fun onFragmentAttached() {
    }

    override fun showSuccessToast() {
    }

    override fun showErrorToast() {
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun openLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
