package {{ cookiecutter.lib_package_name }}

import android.content.Context

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class Api(context: Context?) : ApiAbstract(context) {
    companion object {
        private val TAG = Api::class.java.simpleName
    }
}