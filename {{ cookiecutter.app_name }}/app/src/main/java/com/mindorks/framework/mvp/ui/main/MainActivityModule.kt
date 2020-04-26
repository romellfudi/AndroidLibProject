package {{ cookiecutter.package_name }}.ui.main

import {{ cookiecutter.package_name }}.ui.main.interactor.MainInteractor
import {{ cookiecutter.package_name }}.ui.main.interactor.MainMVPInteractor
import {{ cookiecutter.package_name }}.ui.main.presenter.MainMVPPresenter
import {{ cookiecutter.package_name }}.ui.main.presenter.MainPresenter
import {{ cookiecutter.package_name }}.ui.main.view.MainMVPView
import dagger.Module
import dagger.Provides

/**
 * Created by jyotidubey on 09/01/18.
 */
@Module
class MainActivityModule {

    @Provides
    internal fun provideMainInteractor(mainInteractor: MainInteractor): MainMVPInteractor = mainInteractor

    @Provides
    internal fun provideMainPresenter(mainPresenter: MainPresenter<MainMVPView, MainMVPInteractor>)
            : MainMVPPresenter<MainMVPView, MainMVPInteractor> = mainPresenter

}