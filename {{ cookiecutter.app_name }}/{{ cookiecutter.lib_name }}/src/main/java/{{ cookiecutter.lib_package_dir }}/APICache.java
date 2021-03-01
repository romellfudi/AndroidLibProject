package {{ cookiecutter.lib_package_name }};

import android.content.Context;
import android.content.SharedPreferences;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
public class APICache {

    public static final String DATA = "DATA";
    public static final String VALUE = "VALUE";

    private static APICache instance;
    private SharedPreferences prefs;

    private APICache(Context context) {
        prefs = context.getSharedPreferences(context.getPackageName(),
                Context.MODE_PRIVATE);
    }

    public static APICache getInstance(Context context) {
        if (instance == null) {
            instance = new APICache(context);
        }
        return instance;
    }

    public void clean() {
        SharedPreferences.Editor e = prefs.edit();
        e = e.clear();
        e.commit();
    }

    public void setValue(Integer data) {
        prefs.edit().putInt(VALUE, data).commit();
    }

    public AtomicInteger getValue() {
        return new AtomicInteger(prefs.getInt(VALUE, -999));
    }

    public AtomicReference getData() {
        return new AtomicReference(prefs.getString(DATA, null));
    }

    public void setData(String canal) {
        prefs.edit().putString(DATA, canal).commit();
    }
}