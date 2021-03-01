package {{ cookiecutter.package_name }}.di

import {{ cookiecutter.package_name }}.ui.about.AboutViewModel
import {{ cookiecutter.package_name }}.ui.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
val viewModelsModule = module {
    viewModel { SplashViewModel(get()) }
    viewModel { AboutViewModel(get()) }
}
