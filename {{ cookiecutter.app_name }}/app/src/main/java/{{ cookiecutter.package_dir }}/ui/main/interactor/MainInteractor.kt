package {{ cookiecutter.package_name }}.ui.main.interactor

import {{ cookiecutter.package_name }}.data.database.repository.options.Options
import {{ cookiecutter.package_name }}.data.database.repository.options.OptionsRepo
import {{ cookiecutter.package_name }}.data.database.repository.questions.Question
import {{ cookiecutter.package_name }}.data.database.repository.questions.QuestionRepo
import {{ cookiecutter.package_name }}.data.network.ApiHelper
import {{ cookiecutter.package_name }}.data.preferences.PreferenceHelper
import {{ cookiecutter.package_name }}.ui.base.interactor.BaseInteractor
import javax.inject.Inject

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class MainInteractor @Inject internal constructor(private val questionRepoHelper: QuestionRepo, private val optionsRepoHelper: OptionsRepo, preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper = preferenceHelper, apiHelper = apiHelper), MainMVPInteractor {

    override fun getQuestionCardData() = questionRepoHelper.loadQuestions()
            .flatMapIterable { question -> question }
            .flatMapSingle { question -> getQuestionCards(question) }
            .toList()

    override fun getUserDetails() = Pair(preferenceHelper.getCurrentUserName(),
            preferenceHelper.getCurrentUserEmail())

    override fun makeLogoutApiCall() = apiHelper.performLogoutApiCall()

    private fun getQuestionCards(question: Question) = optionsRepoHelper.loadOptions(question.id)
            .map { options -> createQuestionCard(options, question) }

    private fun createQuestionCard(options: List<Options>, question: Question) = QuestionCardData(options, question)

}


