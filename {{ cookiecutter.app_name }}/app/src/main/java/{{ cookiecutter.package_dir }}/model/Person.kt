package {{ cookiecutter.package_name }}.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import {{ cookiecutter.package_name }}.util.ListStringConverter

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
@Entity
@TypeConverters(ListStringConverter::class)
class Person {
    @PrimaryKey
    @NonNull
    var id: String? = null
    var weight: String? = null
}