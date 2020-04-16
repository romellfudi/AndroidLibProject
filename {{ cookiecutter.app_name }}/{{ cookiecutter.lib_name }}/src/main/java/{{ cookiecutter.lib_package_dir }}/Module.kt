package {{ cookiecutter.lib_package_name }};

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
interface Module {
    fun sendData(hash: Int, dataResponse: DataResponse?)
}
