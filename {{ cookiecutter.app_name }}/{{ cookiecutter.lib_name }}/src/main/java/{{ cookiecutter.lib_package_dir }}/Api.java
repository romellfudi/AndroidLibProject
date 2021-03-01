package {{ cookiecutter.lib_package_name }};

import android.content.Context;

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
public class Api extends ApiAbstract {

    private static final String TAG = Api.class.getSimpleName();

    public Api(Context context) {
        super(context);
    }

}