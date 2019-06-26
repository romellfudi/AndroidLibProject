package {{ cookiecutter.lib_package_name }};

import android.content.Context;

public class Api extends ApiAbstract {

    private static final String TAG = Api.class.getSimpleName();

    public Api(Context context) {
        super(context);
    }

}