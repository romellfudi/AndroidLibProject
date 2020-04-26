package {{ cookiecutter.package_name }}.ui.rate

import {{ cookiecutter.package_name }}.ui.rate.view.RateUsDialog
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by jyotidubey on 15/01/18.
 */
@Module
abstract class RateUsDialogFragmentProvider{

    @ContributesAndroidInjector(modules = [RateUsFragmentModule::class])
    internal abstract fun provideRateUsFragment() : RateUsDialog
}