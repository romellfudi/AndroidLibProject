package {{ cookiecutter.package_name }}.ui.feed.blog.view

import {{ cookiecutter.package_name }}.data.network.Blog
import {{ cookiecutter.package_name }}.ui.base.view.MVPView

/**
 * Created by jyotidubey on 13/01/18.
 */
interface BlogMVPView : MVPView {

    fun displayBlogList(blogs: List<Blog>?) : Unit?

}