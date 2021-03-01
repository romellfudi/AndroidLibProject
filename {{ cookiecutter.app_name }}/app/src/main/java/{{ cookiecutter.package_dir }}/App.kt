package {{ cookiecutter.package_name }}

import android.app.Application
import {{ cookiecutter.package_name }}.di.appComponent

import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
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