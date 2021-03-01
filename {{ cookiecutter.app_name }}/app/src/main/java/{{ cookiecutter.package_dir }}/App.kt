package {{ cookiecutter.package_name }}

import android.app.Application
import {{ cookiecutter.package_name }}.di.appComponent

import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class App : Application() {


    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(appComponent)
        }
    }

}