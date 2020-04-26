package {{ cookiecutter.package_name }}.ui.base.presenter

import {{ cookiecutter.package_name }}.ui.base.interactor.MVPInteractor
import {{ cookiecutter.package_name }}.ui.base.view.MVPView

/**
 * Created by jyotidubey on 04/01/18.
 */
interface MVPPresenter<V : MVPView, I : MVPInteractor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?

}