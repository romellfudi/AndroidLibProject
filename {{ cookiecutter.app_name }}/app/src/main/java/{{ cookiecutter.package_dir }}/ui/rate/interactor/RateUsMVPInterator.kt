package {{ cookiecutter.package_name }}.ui.rate.interactor

import {{ cookiecutter.package_name }}.ui.base.interactor.MVPInteractor

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface RateUsMVPInterator : MVPInteractor{

    fun submitRating()
}