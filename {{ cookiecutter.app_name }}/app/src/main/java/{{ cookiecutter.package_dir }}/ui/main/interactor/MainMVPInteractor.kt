package {{ cookiecutter.package_name }}.ui.main.interactor

import {{ cookiecutter.package_name }}.data.network.LogoutResponse
import {{ cookiecutter.package_name }}.ui.base.interactor.MVPInteractor
import io.reactivex.Observable
import io.reactivex.Single

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface MainMVPInteractor : MVPInteractor {

    fun getQuestionCardData(): Single<List<QuestionCardData>>
    fun getUserDetails() : Pair<String?,String?>
    fun makeLogoutApiCall() : Observable<LogoutResponse>
}