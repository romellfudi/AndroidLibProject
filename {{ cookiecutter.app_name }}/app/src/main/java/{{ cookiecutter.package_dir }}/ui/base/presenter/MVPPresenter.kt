package {{ cookiecutter.package_name }}.ui.base.presenter

import {{ cookiecutter.package_name }}.ui.base.interactor.MVPInteractor
import {{ cookiecutter.package_name }}.ui.base.view.MVPView

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface MVPPresenter<V : MVPView, I : MVPInteractor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?

}