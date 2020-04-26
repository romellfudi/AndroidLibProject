package {{ cookiecutter.package_name }}.ui.feed.blog.presenter

import {{ cookiecutter.package_name }}.ui.base.presenter.MVPPresenter
import {{ cookiecutter.package_name }}.ui.feed.blog.interactor.BlogMVPInteractor
import {{ cookiecutter.package_name }}.ui.feed.blog.view.BlogMVPView

/**
 * Created by jyotidubey on 13/01/18.
 */
interface BlogMVPPresenter<V : BlogMVPView, I : BlogMVPInteractor> : MVPPresenter<V, I> {

    fun onViewPrepared()
}