package {{ cookiecutter.package_name }}.ui.login

import {{ cookiecutter.package_name }}.ui.login.interactor.LoginInteractor
import {{ cookiecutter.package_name }}.ui.login.interactor.LoginMVPInteractor
import {{ cookiecutter.package_name }}.ui.login.presenter.LoginMVPPresenter
import {{ cookiecutter.package_name }}.ui.login.presenter.LoginPresenter
import {{ cookiecutter.package_name }}.ui.login.view.LoginMVPView
import dagger.Module
import dagger.Provides

/**
 * Created by jyotidubey on 10/01/18.
 */
@Module
class LoginActivityModule {

    @Provides
    internal fun provideLoginInteractor(interactor: LoginInteractor): LoginMVPInteractor = interactor

    @Provides
    internal fun provideLoginPresenter(presenter: LoginPresenter<LoginMVPView, LoginMVPInteractor>)
            : LoginMVPPresenter<LoginMVPView, LoginMVPInteractor> = presenter

}