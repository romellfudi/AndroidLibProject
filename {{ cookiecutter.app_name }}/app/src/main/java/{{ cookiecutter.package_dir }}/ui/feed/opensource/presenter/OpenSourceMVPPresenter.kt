package {{ cookiecutter.package_name }}.ui.feed.opensource.presenter

import {{ cookiecutter.package_name }}.ui.base.presenter.MVPPresenter
import {{ cookiecutter.package_name }}.ui.feed.opensource.interactor.OpenSourceMVPInteractor
import {{ cookiecutter.package_name }}.ui.feed.opensource.view.OpenSourceMVPView

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface OpenSourceMVPPresenter<V : OpenSourceMVPView, I : OpenSourceMVPInteractor> : MVPPresenter<V, I> {

    fun onViewPrepared()
}