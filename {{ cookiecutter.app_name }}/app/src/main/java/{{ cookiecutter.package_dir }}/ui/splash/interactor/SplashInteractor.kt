package {{ cookiecutter.package_name }}.ui.splash.interactor

import android.content.Context
import com.google.gson.GsonBuilder
import com.google.gson.internal.`$Gson$Types`
import {{ cookiecutter.package_name }}.data.database.repository.options.Options
import {{ cookiecutter.package_name }}.data.database.repository.options.OptionsRepo
import {{ cookiecutter.package_name }}.data.database.repository.questions.Question
import {{ cookiecutter.package_name }}.data.database.repository.questions.QuestionRepo
import {{ cookiecutter.package_name }}.data.network.ApiHelper
import {{ cookiecutter.package_name }}.data.preferences.PreferenceHelper
import {{ cookiecutter.package_name }}.ui.base.interactor.BaseInteractor
import {{ cookiecutter.package_name }}.util.AppConstants
import {{ cookiecutter.package_name }}.util.FileUtils
import io.reactivex.Observable
import javax.inject.Inject

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class SplashInteractor @Inject constructor(private val mContext: Context, private val questionRepoHelper: QuestionRepo, private val optionsRepoHelper: OptionsRepo, preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), SplashMVPInteractor {

    override fun getQuestion(): Observable<List<Question>> {
        return questionRepoHelper.loadQuestions()
    }

    override fun seedQuestions(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return questionRepoHelper.isQuestionsRepoEmpty().concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Question::class.java)
                val questionList = gson.fromJson<List<Question>>(
                        FileUtils.loadJSONFromAsset(
                                mContext,
                                AppConstants.SEED_DATABASE_QUESTIONS),
                        type)
                questionRepoHelper.insertQuestions(questionList)
            } else
                Observable.just(false)
        }
    }

    override fun seedOptions(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return optionsRepoHelper.isOptionsRepoEmpty().concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Options::class.java)
                val optionsList = gson.fromJson<List<Options>>(
                        FileUtils.loadJSONFromAsset(
                                mContext,
                                AppConstants.SEED_DATABASE_OPTIONS),
                        type)
                optionsRepoHelper.insertOptions(optionsList)
            } else
                Observable.just(false)
        }
    }
}