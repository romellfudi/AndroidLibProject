package {{ cookiecutter.package_name }}.ui.about.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import {{ cookiecutter.package_name }}.R
import {{ cookiecutter.package_name }}.ui.base.view.BaseFragment
import kotlinx.android.synthetic.main.fragment_about.*

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class AboutFragment : BaseFragment() {

    companion object {

        internal val TAG = "AboutFragment"

        fun newInstance(): AboutFragment {
            return AboutFragment()
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
            inflater.inflate(R.layout.fragment_about, container, false)

    override fun setUp() = navBackBtn.setOnClickListener { getBaseActivity()?.onFragmentDetached(TAG) }

}