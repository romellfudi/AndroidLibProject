package {{ cookiecutter.package_name }}.ui.main.view

import {{ cookiecutter.package_name }}.ui.base.view.MVPView
import {{ cookiecutter.package_name }}.ui.main.interactor.QuestionCardData

/**
 * Created by jyotidubey on 08/01/18.
 */
interface MainMVPView : MVPView {

    fun inflateUserDetails(userDetails: Pair<String?, String?>)
    fun displayQuestionCard(questionCard: List<QuestionCardData>)
    fun openLoginActivity()
    fun openFeedActivity()
    fun openAboutFragment()
    fun openRateUsDialog(): Unit?
    fun lockDrawer(): Unit?
    fun unlockDrawer(): Unit?
}