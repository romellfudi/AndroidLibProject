package {{ cookiecutter.lib_package_name }}

import android.content.Context

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
class Api(context: Context?) : ApiAbstract(context) {
    companion object {
        private val TAG = Api::class.java.simpleName
    }
}