package {{ cookiecutter.package_name }}.ui.feed.opensource.view

import {{ cookiecutter.package_name }}.data.network.OpenSource
import {{ cookiecutter.package_name }}.ui.base.view.MVPView

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface OpenSourceMVPView : MVPView {
    fun displayOpenSourceList(blogs: List<OpenSource>?)

}