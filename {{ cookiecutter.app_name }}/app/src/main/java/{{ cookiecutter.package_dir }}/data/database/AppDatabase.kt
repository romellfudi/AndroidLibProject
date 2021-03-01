package {{ cookiecutter.package_name }}.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import {{ cookiecutter.package_name }}.data.database.repository.options.Options
import {{ cookiecutter.package_name }}.data.database.repository.options.OptionsDao
import {{ cookiecutter.package_name }}.data.database.repository.questions.Question
import {{ cookiecutter.package_name }}.data.database.repository.questions.QuestionsDao

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Database(entities = [(Question::class), (Options::class)], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun optionsDao(): OptionsDao

    abstract fun questionsDao(): QuestionsDao

}