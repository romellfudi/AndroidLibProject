package {{ cookiecutter.lib_package_name }};

import android.content.Context;

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
public class Api extends ApiAbstract {

    private static final String TAG = Api.class.getSimpleName();

    public Api(Context context) {
        super(context);
    }

}