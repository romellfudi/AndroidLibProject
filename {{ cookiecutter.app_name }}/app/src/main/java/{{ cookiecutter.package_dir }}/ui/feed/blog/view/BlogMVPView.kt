package {{ cookiecutter.package_name }}.ui.feed.blog.view

import {{ cookiecutter.package_name }}.data.network.Blog
import {{ cookiecutter.package_name }}.ui.base.view.MVPView

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface BlogMVPView : MVPView {

    fun displayBlogList(blogs: List<Blog>?) : Unit?

}