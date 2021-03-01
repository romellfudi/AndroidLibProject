package {{ cookiecutter.package_name }}.ui.splash.presenter

import {{ cookiecutter.package_name }}.ui.base.presenter.MVPPresenter
import {{ cookiecutter.package_name }}.ui.splash.interactor.SplashMVPInteractor
import {{ cookiecutter.package_name }}.ui.splash.view.SplashMVPView

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface SplashMVPPresenter<V : SplashMVPView, I : SplashMVPInteractor> : MVPPresenter<V,I>