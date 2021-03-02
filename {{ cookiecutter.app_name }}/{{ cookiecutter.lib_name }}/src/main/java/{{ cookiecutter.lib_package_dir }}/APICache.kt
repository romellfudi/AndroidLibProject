package {{ cookiecutter.lib_package_name }}

import android.content.Context
import android.content.SharedPreferences
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicReference

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class APICache private constructor(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
    fun clean() {
        var e = prefs.edit()
        e = e.clear()
        e.commit()
    }

    fun setValue(data: Int?) {
        prefs.edit().putInt(VALUE, data!!).commit()
    }

    val value: AtomicInteger
        get() = AtomicInteger(prefs.getInt(VALUE, -999))

    val data: AtomicReference<String?>
        get() = AtomicReference(prefs.getString(DATA, null))

    fun setData(canal: String?) {
        prefs.edit().putString(DATA, canal).commit()
    }

    companion object {
        const val DATA = "DATA"
        const val VALUE = "VALUE"
        private var instance: APICache? = null

        fun getInstance(context: Context): APICache {
            if (instance == null)
                instance = APICache(context)
            return instance as APICache
        }
    }

}