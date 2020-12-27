package {{ cookiecutter.package_name }}.ui.feed.blog.interactor

import {{ cookiecutter.package_name }}.data.network.BlogResponse
import {{ cookiecutter.package_name }}.ui.base.interactor.MVPInteractor
import io.reactivex.Observable

/**
 * Created by jyotidubey on 13/01/18.
 */
interface BlogMVPInteractor : MVPInteractor {

    fun getBlogList(): Observable<BlogResponse>

}