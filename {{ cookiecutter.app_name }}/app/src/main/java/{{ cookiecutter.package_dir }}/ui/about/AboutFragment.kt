package {{ cookiecutter.package_name }}.ui.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import {{ cookiecutter.package_name }}.R
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class AboutFragment : Fragment() {

    private val aboutViewModel: AboutViewModel by viewModel()
 
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ImageButton>(R.id.navBackBtn)
            .setOnClickListener { view.findNavController().navigateUp() }
//        splashViewModel.getPokemonById("9").observe(viewLifecycleOwner, Observer {
//            it?.let {
//
//        }
//        })

    }

}
