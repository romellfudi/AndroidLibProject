package {{ cookiecutter.package_name }}.ui.feed

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import {{ cookiecutter.package_name }}.ui.feed.blog.view.BlogFragment
import {{ cookiecutter.package_name }}.ui.feed.opensource.view.OpenSourceFragment

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class FeedPagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    private var tabCount = 0

    override fun getCount(): Int {
        return tabCount
    }

    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> BlogFragment.newInstance()
            1 -> OpenSourceFragment.newInstance()
            else -> null
        }
    }

    internal fun setCount(count: Int) {
        this.tabCount = count
    }

}