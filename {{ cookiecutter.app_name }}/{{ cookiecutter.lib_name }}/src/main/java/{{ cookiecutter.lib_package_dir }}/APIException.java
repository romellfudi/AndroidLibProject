package {{ cookiecutter.lib_package_name }};

public class APIException extends Exception {

    private final Integer codError;

    private final String message;

    public APIException(Throwable throwable) {
        super(throwable);
        this.message = "";
        this.codError = ERROR.GENERIC;
    }

    private APIException(Integer codError, Throwable throwable, String detailMessage) {
        super(detailMessage, throwable);
        this.codError = codError;
        this.message = detailMessage;
    }

    public APIException(Integer codError, String detailMessage) {
        super(detailMessage);
        this.codError = codError;
        this.message = detailMessage;
    }

    public static final class ERROR {
        public static final Integer GENERIC = 99;

        private ERROR() {
            throw new IllegalAccessError("Utility class");
        }
    }

    public APIException setCause(String message) {
        this.initCause(new Throwable(message));
        return this;
    }

    public Integer getCodError() {
        return codError;
    }


    public static APIException getFactoryException( Integer error) {
        return new APIException(ERROR.GENERIC, "Default message");
    }

    public String getAllcauses() {
        String strings = getLocalizedMessage();
        Throwable cause = this;
        while (cause.getCause() != null) {
            cause = cause.getCause();
            strings = strings.concat(" => " + cause.getLocalizedMessage());
        }
        return strings;
    }

    public String getMessage() {
        return message;
    }
}
