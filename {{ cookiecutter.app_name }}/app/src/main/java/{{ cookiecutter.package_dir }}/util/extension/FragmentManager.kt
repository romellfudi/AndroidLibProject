package {{ cookiecutter.package_name }}.util.extension

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.widget.ImageView
import com.bumptech.glide.Glide
import {{ cookiecutter.package_name }}.R

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
internal fun FragmentManager.removeFragment(tag: String,
                                            slideIn: Int = R.anim.slide_left,
                                            slideOut: Int = R.anim.slide_right) {
    this.beginTransaction()
            .disallowAddToBackStack()
            .setCustomAnimations(slideIn, slideOut)
            .remove(this.findFragmentByTag(tag)!!)
            .commitNow()
}

internal fun FragmentManager.addFragment(containerViewId: Int,
                                         fragment: Fragment,
                                         tag: String,
                                         slideIn: Int = R.anim.slide_left,
                                         slideOut: Int = R.anim.slide_right) {
    this.beginTransaction().disallowAddToBackStack()
            .setCustomAnimations(slideIn, slideOut)
            .add(containerViewId, fragment, tag)
            .commit()
}

