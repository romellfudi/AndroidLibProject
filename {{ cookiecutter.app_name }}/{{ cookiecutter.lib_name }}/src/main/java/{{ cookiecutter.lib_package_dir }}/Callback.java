package {{ cookiecutter.lib_package_name }};

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
public abstract class Callback<T extends DataResponse> {

    public abstract void throwError(APIException exception);

    public abstract void response(T bean);
}
