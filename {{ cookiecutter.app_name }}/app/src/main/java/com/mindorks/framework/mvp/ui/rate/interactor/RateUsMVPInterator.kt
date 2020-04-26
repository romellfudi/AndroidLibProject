package {{ cookiecutter.package_name }}.ui.rate.interactor

import {{ cookiecutter.package_name }}.ui.base.interactor.MVPInteractor

/**
 * Created by jyotidubey on 15/01/18.
 */
interface RateUsMVPInterator : MVPInteractor{

    fun submitRating()
}