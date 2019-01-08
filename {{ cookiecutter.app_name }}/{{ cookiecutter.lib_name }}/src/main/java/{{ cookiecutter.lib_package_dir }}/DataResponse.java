package {{ cookiecutter.lib_package_name }};

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