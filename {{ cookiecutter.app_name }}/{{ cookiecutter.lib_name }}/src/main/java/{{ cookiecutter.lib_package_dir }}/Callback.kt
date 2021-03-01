package {{ cookiecutter.lib_package_name }};

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
abstract class Callback<T : DataResponse?> {
    abstract fun throwError(exception: APIException?)
    abstract fun response(bean: T)
}
