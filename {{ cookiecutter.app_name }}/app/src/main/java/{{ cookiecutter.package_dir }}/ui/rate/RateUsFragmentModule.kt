package {{ cookiecutter.package_name }}.ui.rate

import {{ cookiecutter.package_name }}.ui.rate.interactor.RateUsInteractor
import {{ cookiecutter.package_name }}.ui.rate.interactor.RateUsMVPInterator
import {{ cookiecutter.package_name }}.ui.rate.presenter.RateUsMVPPresenter
import {{ cookiecutter.package_name }}.ui.rate.presenter.RateUsPresenter
import {{ cookiecutter.package_name }}.ui.rate.view.RateUsDialogMVPView
import dagger.Module
import dagger.Provides

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Module
class RateUsFragmentModule {

    @Provides
    internal fun provideRateUsInteractor(interactor: RateUsInteractor): RateUsMVPInterator = interactor

    @Provides
    internal fun provideRateUsPresenter(presenter: RateUsPresenter<RateUsDialogMVPView, RateUsMVPInterator>)
            : RateUsMVPPresenter<RateUsDialogMVPView, RateUsMVPInterator> = presenter
}