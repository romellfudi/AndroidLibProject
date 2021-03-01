package {{ cookiecutter.package_name }}.data.network

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
data class OpenSource(@Expose
                      @SerializedName("project_url")
                      var projectUrl: String? = null,

                      @Expose
                      @SerializedName("img_url")
                      var coverImgUrl: String? = null,

                      @Expose
                      @SerializedName("title")
                      var title: String? = null,

                      @Expose
                      @SerializedName("description")
                      var description: String? = null)