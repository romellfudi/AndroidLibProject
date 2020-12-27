package {{ cookiecutter.package_name }}.di.builder

import {{ cookiecutter.package_name }}.ui.about.AboutFragmentProvider
import {{ cookiecutter.package_name }}.ui.feed.blog.BlogFragmentProvider
import {{ cookiecutter.package_name }}.ui.feed.opensource.OpenSourceFragmentProvider
import {{ cookiecutter.package_name }}.ui.feed.view.FeedActivity
import {{ cookiecutter.package_name }}.ui.login.LoginActivityModule
import {{ cookiecutter.package_name }}.ui.login.view.LoginActivity
import {{ cookiecutter.package_name }}.ui.main.MainActivityModule
import {{ cookiecutter.package_name }}.ui.main.view.MainActivity
import {{ cookiecutter.package_name }}.ui.rate.RateUsDialogFragmentProvider
import {{ cookiecutter.package_name }}.ui.splash.SplashActivityModule
import {{ cookiecutter.package_name }}.ui.splash.view.SplashMVPActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by jyotidubey on 05/01/18.
 */
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(SplashActivityModule::class)])
    abstract fun bindSplashActivity(): SplashMVPActivity

    @ContributesAndroidInjector(modules = [(MainActivityModule::class), (RateUsDialogFragmentProvider::class), (AboutFragmentProvider::class)])
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [(LoginActivityModule::class)])
    abstract fun bindLoginActivity(): LoginActivity

    @ContributesAndroidInjector(modules = [(BlogFragmentProvider::class), (OpenSourceFragmentProvider::class)])
    abstract fun bindFeedActivity(): FeedActivity

}