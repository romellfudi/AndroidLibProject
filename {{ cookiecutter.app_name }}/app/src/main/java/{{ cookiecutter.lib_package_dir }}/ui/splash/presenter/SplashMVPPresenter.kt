package {{ cookiecutter.package_name }}.ui.splash.presenter

import {{ cookiecutter.package_name }}.ui.base.presenter.MVPPresenter
import {{ cookiecutter.package_name }}.ui.splash.interactor.SplashMVPInteractor
import {{ cookiecutter.package_name }}.ui.splash.view.SplashMVPView

/**
 * Created by jyotidubey on 04/01/18.
 */
interface SplashMVPPresenter<V : SplashMVPView, I : SplashMVPInteractor> : MVPPresenter<V,I>