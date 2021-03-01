package {{ cookiecutter.package_name }}.ui.main

import {{ cookiecutter.package_name }}.ui.main.interactor.MainInteractor
import {{ cookiecutter.package_name }}.ui.main.interactor.MainMVPInteractor
import {{ cookiecutter.package_name }}.ui.main.presenter.MainMVPPresenter
import {{ cookiecutter.package_name }}.ui.main.presenter.MainPresenter
import {{ cookiecutter.package_name }}.ui.main.view.MainMVPView
import dagger.Module
import dagger.Provides

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Module
class MainActivityModule {

    @Provides
    internal fun provideMainInteractor(mainInteractor: MainInteractor): MainMVPInteractor = mainInteractor

    @Provides
    internal fun provideMainPresenter(mainPresenter: MainPresenter<MainMVPView, MainMVPInteractor>)
            : MainMVPPresenter<MainMVPView, MainMVPInteractor> = mainPresenter

}