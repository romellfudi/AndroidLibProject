package {{ cookiecutter.package_name }}.ui.main.interactor

import {{ cookiecutter.package_name }}.data.network.LogoutResponse
import {{ cookiecutter.package_name }}.ui.base.interactor.MVPInteractor
import io.reactivex.Observable
import io.reactivex.Single

/**
 * Created by jyotidubey on 08/01/18.
 */
interface MainMVPInteractor : MVPInteractor {

    fun getQuestionCardData(): Single<List<QuestionCardData>>
    fun getUserDetails() : Pair<String?,String?>
    fun makeLogoutApiCall() : Observable<LogoutResponse>
}