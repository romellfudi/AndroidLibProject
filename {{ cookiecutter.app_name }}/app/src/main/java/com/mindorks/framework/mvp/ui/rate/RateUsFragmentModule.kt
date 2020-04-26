package {{ cookiecutter.package_name }}.ui.rate

import {{ cookiecutter.package_name }}.ui.rate.interactor.RateUsInteractor
import {{ cookiecutter.package_name }}.ui.rate.interactor.RateUsMVPInterator
import {{ cookiecutter.package_name }}.ui.rate.presenter.RateUsMVPPresenter
import {{ cookiecutter.package_name }}.ui.rate.presenter.RateUsPresenter
import {{ cookiecutter.package_name }}.ui.rate.view.RateUsDialogMVPView
import dagger.Module
import dagger.Provides

/**
 * Created by jyotidubey on 15/01/18.
 */
@Module
class RateUsFragmentModule {

    @Provides
    internal fun provideRateUsInteractor(interactor: RateUsInteractor): RateUsMVPInterator = interactor

    @Provides
    internal fun provideRateUsPresenter(presenter: RateUsPresenter<RateUsDialogMVPView, RateUsMVPInterator>)
            : RateUsMVPPresenter<RateUsDialogMVPView, RateUsMVPInterator> = presenter
}