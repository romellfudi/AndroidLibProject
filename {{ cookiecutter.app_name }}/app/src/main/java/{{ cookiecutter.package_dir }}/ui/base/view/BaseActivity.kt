package {{ cookiecutter.package_name }}.ui.base.view

import android.app.ProgressDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import {{ cookiecutter.package_name }}.util.CommonUtil
import dagger.android.AndroidInjection

/**
 * Created by jyotidubey on 04/01/18.
 */
abstract class BaseActivity : AppCompatActivity(), MVPView, BaseFragment.CallBack {

    private var progressDialog: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        performDI()
        super.onCreate(savedInstanceState)
    }

    override fun hideProgress() {
        progressDialog?.let { if (it.isShowing) it.cancel() }
    }

    override fun showProgress() {
        hideProgress()
        progressDialog = CommonUtil.showLoadingDialog(this)
    }

    private fun performDI() = AndroidInjection.inject(this)

}