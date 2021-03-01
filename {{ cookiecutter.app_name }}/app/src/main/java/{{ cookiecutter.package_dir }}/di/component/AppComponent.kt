package {{ cookiecutter.package_name }}.di.component

import android.app.Application
import {{ cookiecutter.package_name }}.MvpApp
import {{ cookiecutter.package_name }}.di.builder.ActivityBuilder
import {{ cookiecutter.package_name }}.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Singleton
@Component(modules = [(AndroidInjectionModule::class), (AppModule::class), (ActivityBuilder::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: MvpApp)

}