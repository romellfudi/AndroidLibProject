package {{ cookiecutter.package_name }}.ui.rate.view

import {{ cookiecutter.package_name }}.ui.base.view.MVPView

/**
 * Created by jyotidubey on 14/01/18.
 */
interface RateUsDialogMVPView : MVPView{

    fun dismissDialog()
    fun showRatingSubmissionSuccessMessage()
}