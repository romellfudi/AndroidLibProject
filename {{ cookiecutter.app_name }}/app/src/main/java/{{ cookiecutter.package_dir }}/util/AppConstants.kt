package {{ cookiecutter.package_name }}.util

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
object AppConstants {

    internal val APP_DB_NAME = "mindorks_mvp.db"
    internal val PREF_NAME = "mindorks_pref"
    internal val SEED_DATABASE_QUESTIONS = "seed/questions.json"
    internal val SEED_DATABASE_OPTIONS = "seed/options.json"
    internal val EMPTY_EMAIL_ERROR = 1001
    internal val INVALID_EMAIL_ERROR = 1002
    internal val EMPTY_PASSWORD_ERROR = 1003
    internal val LOGIN_FAILURE = 1004
    internal val NULL_INDEX = -1L

    enum class LoggedInMode constructor(val type: Int) {
        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_GOOGLE(1),
        LOGGED_IN_MODE_FB(2),
        LOGGED_IN_MODE_SERVER(3)
    }
}