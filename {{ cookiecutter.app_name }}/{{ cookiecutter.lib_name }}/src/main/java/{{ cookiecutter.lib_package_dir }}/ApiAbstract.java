package {{ cookiecutter.lib_package_name }};

import android.content.Context;

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
public abstract class ApiAbstract implements Module {

    private Context context;
    private APICache aPICache;

    private boolean timeOut;

    public ApiAbstract(Context context){
        setContext(context);
        if (context != null) {
            aPICache = APICache.getInstance(context);
        }
    }

    @Override
    public void sendData(int hash, DataResponse dataResponse) {

    }


    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public APICache getaPICache() {
        return aPICache;
    }

    public int getValue() {
        return aPICache.getValue().get();
    }

    public void setValue(int data) {
        aPICache.setValue(data);
    }
    public String getData() {
        return aPICache.getData().toString();
    }

    public void setData(String data) {
        aPICache.setData(data);
    }


}
