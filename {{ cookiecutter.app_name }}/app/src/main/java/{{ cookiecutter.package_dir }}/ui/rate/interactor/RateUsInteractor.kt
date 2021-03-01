package {{ cookiecutter.package_name }}.ui.rate.interactor

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
class RateUsInteractor @Inject internal constructor(apiHelper: ApiHelper, preferenceHelper: PreferenceHelper) : BaseInteractor(apiHelper = apiHelper, preferenceHelper = preferenceHelper), RateUsMVPInterator {

    override fun submitRating() {}
}