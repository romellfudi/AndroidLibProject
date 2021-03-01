package {{ cookiecutter.package_name }}.ui.feed.opensource.interactor

import {{ cookiecutter.package_name }}.data.network.OpenSourceResponse
import {{ cookiecutter.package_name }}.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface OpenSourceMVPInteractor : MVPInteractor {

    fun getOpenSourceList(): Observable<OpenSourceResponse>
}