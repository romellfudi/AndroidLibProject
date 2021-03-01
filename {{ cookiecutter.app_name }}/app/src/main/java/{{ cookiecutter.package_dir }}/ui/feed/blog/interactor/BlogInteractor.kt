package {{ cookiecutter.package_name }}.ui.feed.blog.interactor

import {{ cookiecutter.package_name }}.data.network.ApiHelper
import {{ cookiecutter.package_name }}.data.preferences.PreferenceHelper
import {{ cookiecutter.package_name }}.ui.base.interactor.BaseInteractor
import javax.inject.Inject

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class BlogInteractor @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractor(preferenceHelper, apiHelper), BlogMVPInteractor {

    override fun getBlogList() = apiHelper.getBlogApiCall()

}