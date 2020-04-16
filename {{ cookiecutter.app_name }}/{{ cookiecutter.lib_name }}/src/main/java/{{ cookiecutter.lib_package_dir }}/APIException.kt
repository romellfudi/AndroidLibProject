package {{ cookiecutter.lib_package_name }} 

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
class APIException : Exception {
    val codError: Int
    override val message: String

    constructor(throwable: Throwable?) : super(throwable) {
        message = ""
        codError = ERROR.GENERIC
    }

    private constructor(codError: Int, throwable: Throwable, detailMessage: String) : super(detailMessage, throwable) {
        this.codError = codError
        message = detailMessage
    }

    constructor(codError: Int, detailMessage: String) : super(detailMessage) {
        this.codError = codError
        message = detailMessage
    }

    class ERROR private constructor() {
        companion object {
            const val GENERIC = 99
        }

        init {
            throw IllegalAccessError("Utility class")
        }
    }

    fun setCause(message: String?): APIException {
        initCause(Throwable(message))
        return this
    }

    val allcauses: String
        get() {
            var strings = localizedMessage
            var cause: Throwable? = this
            while (cause!!.cause != null) {
                cause = cause.cause
                strings = strings + " => " + cause!!.localizedMessage
            }
            return strings
        }

    companion object {
        fun getFactoryException(error: Int?): APIException {
            return APIException(ERROR.GENERIC, "Default message")
        }
    }
}