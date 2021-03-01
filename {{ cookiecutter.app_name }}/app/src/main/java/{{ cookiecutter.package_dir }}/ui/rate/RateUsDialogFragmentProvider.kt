package {{ cookiecutter.package_name }}.ui.rate

import {{ cookiecutter.package_name }}.ui.rate.view.RateUsDialog
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Module
abstract class RateUsDialogFragmentProvider{

    @ContributesAndroidInjector(modules = [RateUsFragmentModule::class])
    internal abstract fun provideRateUsFragment() : RateUsDialog
}