package {{ cookiecutter.package_name }}.util

import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import {{ cookiecutter.package_name }}.R

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
object CommonUtil {

    fun showLoadingDialog(context: Context?): ProgressDialog {
        val progressDialog = ProgressDialog(context)
        progressDialog.let {
            it.show()
//            it.window?.setBackgroundDrawable(Color.TRANSPARENT.toDrawable())
            it.setContentView(R.layout.progress_dialog)
            it.isIndeterminate = true
            it.setCancelable(false)
            it.setCanceledOnTouchOutside(false)
            return it
        }
    }

}