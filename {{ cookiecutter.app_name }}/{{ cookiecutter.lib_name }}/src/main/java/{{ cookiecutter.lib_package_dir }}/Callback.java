package {{ cookiecutter.lib_package_name }};

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
public abstract class Callback<T extends DataResponse> {

    public abstract void throwError(APIException exception);

    public abstract void response(T bean);
}
