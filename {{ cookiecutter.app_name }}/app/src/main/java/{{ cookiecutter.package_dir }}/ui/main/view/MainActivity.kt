package {{ cookiecutter.package_name }}.ui.main.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import {{ cookiecutter.package_name }}.R
import {{ cookiecutter.package_name }}.ui.about.view.AboutFragment
import {{ cookiecutter.package_name }}.ui.base.view.BaseActivity
import {{ cookiecutter.package_name }}.ui.feed.view.FeedActivity
import {{ cookiecutter.package_name }}.ui.login.view.LoginActivity
import {{ cookiecutter.package_name }}.ui.main.interactor.MainMVPInteractor
import {{ cookiecutter.package_name }}.ui.main.interactor.QuestionCardData
import {{ cookiecutter.package_name }}.ui.main.presenter.MainMVPPresenter
import {{ cookiecutter.package_name }}.ui.rate.view.RateUsDialog
import {{ cookiecutter.package_name }}.util.ScreenUtils
import {{ cookiecutter.package_name }}.util.extension.addFragment
import {{ cookiecutter.package_name }}.util.extension.removeFragment
import com.mindorks.placeholderview.SwipeDecor
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_navigation.*
import kotlinx.android.synthetic.main.nav_header_navigation.view.*
import javax.inject.Inject

class MainActivity : BaseActivity(), MainMVPView, NavigationView.OnNavigationItemSelectedListener,
        HasSupportFragmentInjector {

    @Inject
    internal lateinit var presenter: MainMVPPresenter<MainMVPView, MainMVPInteractor>
    @Inject
    internal lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpDrawerMenu()
        setupCardContainerView()
        presenter.onAttach(this)
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        }
        val fragment = supportFragmentManager.findFragmentByTag(AboutFragment.TAG)
        fragment?.let { onFragmentDetached(AboutFragment.TAG) } ?: super.onBackPressed()
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onFragmentDetached(tag: String) {
        supportFragmentManager?.removeFragment(tag = tag)
        unlockDrawer()
    }

    override fun onFragmentAttached() {
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navItemAbout -> {
                presenter.onDrawerOptionAboutClick()
            }
            R.id.navItemRateUs -> {
                presenter.onDrawerOptionRateUsClick()
            }
            R.id.navItemFeed -> {
                presenter.onDrawerOptionFeedClick()
            }
            R.id.navItemLogout -> {
                presenter.onDrawerOptionLogoutClick()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun lockDrawer() = drawerLayout?.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)

    override fun unlockDrawer() = drawerLayout?.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)

    override fun displayQuestionCard(questionCards: List<QuestionCardData>) {
        for (questionCard in questionCards) {
            questionHolder.addView(QuestionCard(questionCard))
        }
    }

    override fun inflateUserDetails(userDetails: Pair<String?, String?>) {
        navView.getHeaderView(0).nav_name.text = userDetails.first
        navView.getHeaderView(0).nav_email.text = userDetails.second
    }

    override fun openLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun openAboutFragment() {
        lockDrawer()
        supportFragmentManager.addFragment(R.id.cl_root_view, AboutFragment.newInstance(), AboutFragment.TAG)
    }

    override fun openFeedActivity() {
        val intent = Intent(this, FeedActivity::class.java)
        startActivity(intent)
    }

    override fun openRateUsDialog() = RateUsDialog.newInstance().let {
        it?.show(supportFragmentManager)
    }

    override fun supportFragmentInjector() = fragmentDispatchingAndroidInjector

    private fun setUpDrawerMenu() {
        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(
                this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)

    }

    private fun setupCardContainerView() {
        val screenWidth = ScreenUtils.getScreenWidth(this)
        val screenHeight = ScreenUtils.getScreenHeight(this)
        questionHolder.builder
                .setDisplayViewCount(3)
                .setHeightSwipeDistFactor(10f)
                .setWidthSwipeDistFactor(5f)
                .setSwipeDecor(SwipeDecor()
                        .setViewWidth((0.90 * screenWidth).toInt())
                        .setViewHeight((0.75 * screenHeight).toInt())
                        .setPaddingTop(20)
                        .setSwipeRotationAngle(10)
                        .setRelativeScale(0.01f))
        questionHolder.addItemRemoveListener { count ->
            if (count == 0) {
                Handler(mainLooper).postDelayed({ presenter.refreshQuestionCards() }, 800)
            }
        }
    }
}
