package {{ cookiecutter.package_name }}.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
data class LoginResponse(@Expose
                         @SerializedName("status_code")
                         var statusCode: String? = null,

                         @Expose
                         @SerializedName("user_id")
                         var userId: Long? = null,

                         @Expose
                         @SerializedName("access_token")
                         var accessToken: String? = null,

                         @Expose
                         @SerializedName("user_name")
                         var userName: String? = null,

                         @Expose
                         @SerializedName("email")
                         var userEmail: String? = null,

                         @Expose
                         @SerializedName("server_profile_pic_url")
                         var serverProfilePicUrl: String? = null,

                         @Expose
                         @SerializedName("fb_profile_pic_url")
                         var fbProfilePicUrl: String? = null,

                         @Expose
                         @SerializedName("google_profile_pic_url")
                         var googleProfilePicUrl: String? = null,

                         @Expose
                         @SerializedName("message")
                         var message: String? = null)


