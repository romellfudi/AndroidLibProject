package {{ cookiecutter.package_name }}.ui.login

import {{ cookiecutter.package_name }}.ui.login.interactor.LoginInteractor
import {{ cookiecutter.package_name }}.ui.login.interactor.LoginMVPInteractor
import {{ cookiecutter.package_name }}.ui.login.presenter.LoginMVPPresenter
import {{ cookiecutter.package_name }}.ui.login.presenter.LoginPresenter
import {{ cookiecutter.package_name }}.ui.login.view.LoginMVPView
import dagger.Module
import dagger.Provides

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Module
class LoginActivityModule {

    @Provides
    internal fun provideLoginInteractor(interactor: LoginInteractor): LoginMVPInteractor = interactor

    @Provides
    internal fun provideLoginPresenter(presenter: LoginPresenter<LoginMVPView, LoginMVPInteractor>)
            : LoginMVPPresenter<LoginMVPView, LoginMVPInteractor> = presenter

}