package {{ cookiecutter.lib_package_name }}

import android.content.Context

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
abstract class ApiAbstract(context: Context?) : Module {
    private lateinit var aPICache: APICache
    private val timeOut = false
    override fun sendData(hash: Int, dataResponse: DataResponse?) {}

    fun getaPICache(): APICache? {
        return aPICache
    }

    var value: Int
        get() = aPICache.value.get()
        set(data) {
            aPICache.setValue(data)
        }

    var data: String?
        get() = aPICache.data.toString()
        set(data) {
            aPICache!!.setData(data)
        }

    init {
        if (context != null) {
            aPICache = APICache.getInstance(context)!!
        }
    }
}