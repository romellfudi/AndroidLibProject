package {{ cookiecutter.package_name }}.ui.feed.opensource.view

import {{ cookiecutter.package_name }}.data.network.OpenSource
import {{ cookiecutter.package_name }}.ui.base.view.MVPView

/**
 * Created by jyotidubey on 14/01/18.
 */
interface OpenSourceMVPView : MVPView {
    fun displayOpenSourceList(blogs: List<OpenSource>?)

}