package {{ cookiecutter.package_name }}.ui.feed.blog.interactor

import {{ cookiecutter.package_name }}.data.network.BlogResponse
import {{ cookiecutter.package_name }}.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface BlogMVPInteractor : MVPInteractor {

    fun getBlogList(): Observable<BlogResponse>

}