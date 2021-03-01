package {{ cookiecutter.package_name }}.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
data class LogoutResponse internal constructor(@Expose
                                               @SerializedName("status_code")
                                               private var statusCode: String? = null,
                                               @Expose
                                               @SerializedName("message")
                                               private var message: String? = null)

