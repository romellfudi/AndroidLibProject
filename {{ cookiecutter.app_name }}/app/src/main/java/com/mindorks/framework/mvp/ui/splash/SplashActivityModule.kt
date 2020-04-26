package {{ cookiecutter.package_name }}.ui.splash

import {{ cookiecutter.package_name }}.ui.splash.interactor.SplashInteractor
import {{ cookiecutter.package_name }}.ui.splash.interactor.SplashMVPInteractor
import {{ cookiecutter.package_name }}.ui.splash.presenter.SplashMVPPresenter
import {{ cookiecutter.package_name }}.ui.splash.presenter.SplashPresenter
import {{ cookiecutter.package_name }}.ui.splash.view.SplashMVPView
import dagger.Module
import dagger.Provides

/**
 * Created by jyotidubey on 06/01/18.
 */
@Module
class SplashActivityModule {

    @Provides
    internal fun provideSplashInteractor(splashInteractor: SplashInteractor): SplashMVPInteractor = splashInteractor

    @Provides
    internal fun provideSplashPresenter(splashPresenter: SplashPresenter<SplashMVPView, SplashMVPInteractor>)
            : SplashMVPPresenter<SplashMVPView, SplashMVPInteractor> = splashPresenter
}