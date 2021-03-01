package {{ cookiecutter.package_name }}.ui.feed.view

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import {{ cookiecutter.package_name }}.R
import {{ cookiecutter.package_name }}.ui.base.view.BaseActivity
import {{ cookiecutter.package_name }}.ui.feed.FeedPagerAdapter
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_feed.*
import javax.inject.Inject

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class FeedActivity : BaseActivity(), HasSupportFragmentInjector {

    @Inject
    internal lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    internal lateinit var feedPagerAdapter: FeedPagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)
        feedPagerAdapter = FeedPagerAdapter(supportFragmentManager)
        setUpFeedPagerAdapter()
    }

    override fun onFragmentAttached() {
    }

    override fun onFragmentDetached(tag: String) {
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment>? {
        return fragmentDispatchingAndroidInjector
    }

    private fun setUpFeedPagerAdapter() {
        feedPagerAdapter.count = 2
        feedViewPager.adapter = feedPagerAdapter
        tabLayout.addTab(tabLayout.newTab().setText(R.string.blogs))
        tabLayout.addTab(tabLayout.newTab().setText(R.string.open_source))
        feedViewPager.offscreenPageLimit = tabLayout.tabCount;
        feedViewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                feedViewPager.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })


    }
}