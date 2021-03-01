package {{ cookiecutter.package_name }}.ui.feed.blog

import {{ cookiecutter.package_name }}.ui.feed.blog.view.BlogFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Module
internal abstract class BlogFragmentProvider {

    @ContributesAndroidInjector(modules = [BlogFragmentModule::class])
    internal abstract fun provideBlogFragmentFactory(): BlogFragment
}