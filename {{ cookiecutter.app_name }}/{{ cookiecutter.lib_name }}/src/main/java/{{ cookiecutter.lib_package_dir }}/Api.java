package {{ cookiecutter.lib_package_name }};

public class Api {

    private static final String TAG = Api.class.getSimpleName();

    protected static APICache apiCache;

    private static Integer getValue() {
        return Api.apiCache.getValue().get();
    }

    private static String getData() {
        return Api.apiCache.getData().toString();
    }
}
