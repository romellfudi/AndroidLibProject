package {{ cookiecutter.package_name }}.ui.feed.opensource

import {{ cookiecutter.package_name }}.ui.feed.opensource.view.OpenSourceFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Module
internal abstract class OpenSourceFragmentProvider {

    @ContributesAndroidInjector(modules = [(OpenSourceFragmentModule::class)])
    internal abstract fun provideBlogFragmentFactory(): OpenSourceFragment

}