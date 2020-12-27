package {{ cookiecutter.package_name }}.ui.main.presenter

import {{ cookiecutter.package_name }}.ui.base.presenter.MVPPresenter
import {{ cookiecutter.package_name }}.ui.main.interactor.MainMVPInteractor
import {{ cookiecutter.package_name }}.ui.main.view.MainMVPView

/**
 * Created by jyotidubey on 08/01/18.
 */
interface MainMVPPresenter<V : MainMVPView, I : MainMVPInteractor> : MVPPresenter<V, I> {

    fun refreshQuestionCards(): Boolean?
    fun onDrawerOptionAboutClick() : Unit?
    fun onDrawerOptionRateUsClick(): Unit?
    fun onDrawerOptionFeedClick(): Unit?
    fun onDrawerOptionLogoutClick()

}