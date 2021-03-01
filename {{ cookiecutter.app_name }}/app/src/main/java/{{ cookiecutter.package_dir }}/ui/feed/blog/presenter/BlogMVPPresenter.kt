package {{ cookiecutter.package_name }}.ui.feed.blog.presenter

import {{ cookiecutter.package_name }}.ui.base.presenter.MVPPresenter
import {{ cookiecutter.package_name }}.ui.feed.blog.interactor.BlogMVPInteractor
import {{ cookiecutter.package_name }}.ui.feed.blog.view.BlogMVPView

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface BlogMVPPresenter<V : BlogMVPView, I : BlogMVPInteractor> : MVPPresenter<V, I> {

    fun onViewPrepared()
}