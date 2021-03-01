package {{ cookiecutter.package_name }}.di

import androidx.room.Room
import {{ cookiecutter.package_name }}.R
import {{ cookiecutter.package_name }}.data.AppDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
val databaseModule = module {
    single {
        Room.databaseBuilder(
            androidApplication(),
            AppDatabase::class.java,
            androidApplication().baseContext.getString(R.string.app_name)
        ).build()
    }

    single {
        get<AppDatabase>().pokemonDAO()
    }
}
