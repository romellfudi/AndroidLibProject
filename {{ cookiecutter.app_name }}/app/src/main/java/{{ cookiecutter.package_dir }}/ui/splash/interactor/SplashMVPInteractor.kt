package {{ cookiecutter.package_name }}.ui.splash.interactor

import {{ cookiecutter.package_name }}.data.database.repository.questions.Question
import {{ cookiecutter.package_name }}.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface SplashMVPInteractor : MVPInteractor {

    fun seedQuestions(): Observable<Boolean>
    fun seedOptions(): Observable<Boolean>
    fun getQuestion() : Observable<List<Question>>
}