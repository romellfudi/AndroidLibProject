package {{ cookiecutter.package_name }}.ui.feed.blog.interactor

import {{ cookiecutter.package_name }}.data.network.ApiHelper
import {{ cookiecutter.package_name }}.data.preferences.PreferenceHelper
import {{ cookiecutter.package_name }}.ui.base.interactor.BaseInteractor
import javax.inject.Inject

/**
 * Created by jyotidubey on 13/01/18.
 */
class BlogInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), BlogMVPInteractor {

    override fun getBlogList() = apiHelper.getBlogApiCall()

}