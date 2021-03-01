package {{ cookiecutter.package_name }}.ui.about

import {{ cookiecutter.package_name }}.ui.about.view.AboutFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Module
abstract class AboutFragmentProvider {

    @ContributesAndroidInjector
    abstract internal fun provideAboutFragment(): AboutFragment

}