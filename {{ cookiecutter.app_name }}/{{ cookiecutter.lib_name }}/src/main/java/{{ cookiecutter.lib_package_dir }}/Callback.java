package {{ cookiecutter.lib_package_name }};

public abstract class Callback<T extends DataResponse> {

    public abstract void throwError(APIException exception);

    public abstract void response(T bean);
}
