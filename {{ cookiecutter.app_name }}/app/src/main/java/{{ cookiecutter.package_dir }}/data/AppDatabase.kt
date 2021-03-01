package {{ cookiecutter.package_name }}.data

import androidx.room.Database
import androidx.room.RoomDatabase
import {{ cookiecutter.package_name }}.model.Person

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Database(entities = [Person::class], version = 6, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun pokemonDAO(): PersonDAO
}
