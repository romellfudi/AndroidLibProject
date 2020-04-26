package {{ cookiecutter.package_name }}.ui.splash.interactor

import {{ cookiecutter.package_name }}.data.database.repository.questions.Question
import {{ cookiecutter.package_name }}.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

/**
 * Created by jyotidubey on 04/01/18.
 */
interface SplashMVPInteractor : MVPInteractor {

    fun seedQuestions(): Observable<Boolean>
    fun seedOptions(): Observable<Boolean>
    fun getQuestion() : Observable<List<Question>>
}