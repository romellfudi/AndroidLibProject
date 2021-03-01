package {{ cookiecutter.lib_package_name }};

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface Module {
    fun sendData(hash: Int, dataResponse: DataResponse?)
}
