package {{ cookiecutter.package_name }}.ui.feed.opensource.interactor

import {{ cookiecutter.package_name }}.data.network.OpenSourceResponse
import {{ cookiecutter.package_name }}.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

/**
 * Created by jyotidubey on 14/01/18.
 */
interface OpenSourceMVPInteractor : MVPInteractor {

    fun getOpenSourceList(): Observable<OpenSourceResponse>
}