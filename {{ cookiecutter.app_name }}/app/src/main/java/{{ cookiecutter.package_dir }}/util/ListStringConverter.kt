package {{ cookiecutter.package_name }}.util

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
class ListStringConverter {
    private val gson = Gson()
    private val type: Type = object : TypeToken<List<String>>() {}.type

    @TypeConverter
    fun fromString(json: String?): List<String> {
        return gson.fromJson(json, type)
    }

    @TypeConverter
    fun fromList(list: List<String?>?): String {
        return gson.toJson(list, type)
    }
}
