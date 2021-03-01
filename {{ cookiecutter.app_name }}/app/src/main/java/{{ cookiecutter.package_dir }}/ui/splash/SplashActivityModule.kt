package {{ cookiecutter.package_name }}.ui.splash

import {{ cookiecutter.package_name }}.ui.splash.interactor.SplashInteractor
import {{ cookiecutter.package_name }}.ui.splash.interactor.SplashMVPInteractor
import {{ cookiecutter.package_name }}.ui.splash.presenter.SplashMVPPresenter
import {{ cookiecutter.package_name }}.ui.splash.presenter.SplashPresenter
import {{ cookiecutter.package_name }}.ui.splash.view.SplashMVPView
import dagger.Module
import dagger.Provides

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Module
class SplashActivityModule {

    @Provides
    internal fun provideSplashInteractor(splashInteractor: SplashInteractor): SplashMVPInteractor = splashInteractor

    @Provides
    internal fun provideSplashPresenter(splashPresenter: SplashPresenter<SplashMVPView, SplashMVPInteractor>)
            : SplashMVPPresenter<SplashMVPView, SplashMVPInteractor> = splashPresenter
}