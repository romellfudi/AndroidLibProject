package {{ cookiecutter.package_name }}.ui.main.view

import {{ cookiecutter.package_name }}.ui.base.view.MVPView
import {{ cookiecutter.package_name }}.ui.main.interactor.QuestionCardData

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
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