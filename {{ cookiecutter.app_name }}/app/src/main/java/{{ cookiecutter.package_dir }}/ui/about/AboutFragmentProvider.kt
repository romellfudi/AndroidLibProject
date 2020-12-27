package {{ cookiecutter.package_name }}.ui.about

import {{ cookiecutter.package_name }}.ui.about.view.AboutFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by jyotidubey on 15/01/18.
 */
@Module
abstract class AboutFragmentProvider {

    @ContributesAndroidInjector
    abstract internal fun provideAboutFragment(): AboutFragment

}