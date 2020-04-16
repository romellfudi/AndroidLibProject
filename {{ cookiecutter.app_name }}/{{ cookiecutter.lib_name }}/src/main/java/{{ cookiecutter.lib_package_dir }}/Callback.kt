package {{ cookiecutter.lib_package_name }};

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
abstract class Callback<T : DataResponse?> {
    abstract fun throwError(exception: APIException?)
    abstract fun response(bean: T)
}
