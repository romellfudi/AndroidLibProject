package {{ cookiecutter.package_name }}.ui.feed.opensource.view

import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import {{ cookiecutter.package_name }}.R
import {{ cookiecutter.package_name }}.data.network.OpenSource
import {{ cookiecutter.package_name }}.ui.base.view.BaseFragment
import {{ cookiecutter.package_name }}.ui.feed.opensource.interactor.OpenSourceMVPInteractor
import {{ cookiecutter.package_name }}.ui.feed.opensource.presenter.OpenSourceMVPPresenter
import kotlinx.android.synthetic.main.fragment_open_source.*
import javax.inject.Inject

/**
 * Created by jyotidubey on 13/01/18.
 */
class OpenSourceFragment : BaseFragment(), OpenSourceMVPView {

    companion object {

        fun newInstance(): OpenSourceFragment {
            return OpenSourceFragment()
        }

    }

    @Inject
    internal lateinit var openSourceAdapter: OpenSourceAdapter
    @Inject
    internal lateinit var layoutManager: LinearLayoutManager
    @Inject
    internal lateinit var presenter: OpenSourceMVPPresenter<OpenSourceMVPView, OpenSourceMVPInteractor>


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_open_source, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        presenter.onAttach(this)
        super.onViewCreated(view, savedInstanceState)
    }

    override fun setUp() {
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        repo_recycler_view.layoutManager = layoutManager
        repo_recycler_view.itemAnimator = DefaultItemAnimator()
        repo_recycler_view.adapter = openSourceAdapter
        presenter.onViewPrepared()
    }

    override fun displayOpenSourceList(OpenSources: List<OpenSource>?) {
        OpenSources?.let {
            openSourceAdapter.addOpenSourcesToList(it)
        }
    }

    override fun onDestroyView() {
        presenter.onDetach()
        super.onDestroyView()
    }

}