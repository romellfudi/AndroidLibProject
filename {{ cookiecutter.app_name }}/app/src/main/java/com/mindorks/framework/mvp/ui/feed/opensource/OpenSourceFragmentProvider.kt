package {{ cookiecutter.package_name }}.ui.feed.opensource

import {{ cookiecutter.package_name }}.ui.feed.opensource.view.OpenSourceFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by jyotidubey on 14/01/18.
 */
@Module
internal abstract class OpenSourceFragmentProvider {

    @ContributesAndroidInjector(modules = [(OpenSourceFragmentModule::class)])
    internal abstract fun provideBlogFragmentFactory(): OpenSourceFragment

}