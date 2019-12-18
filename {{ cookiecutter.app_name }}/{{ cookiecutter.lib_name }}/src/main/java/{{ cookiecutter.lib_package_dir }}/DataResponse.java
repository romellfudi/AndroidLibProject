package {{ cookiecutter.lib_package_name }};

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
public abstract class DataResponse {

    private String data;

    protected DataResponse(String data)  {
        this.data = data;
    }

    protected String getData() {
        return data;
    }

    protected void setData(String data) {
        this.data = data;
    }
}