package {{ cookiecutter.package_name }}.ui.splash

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import {{ cookiecutter.package_name }}.R
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
class SplashFragment : Fragment() {

    private val splashViewModel: SplashViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn1).setOnClickListener {
            view.findNavController().navigate(R.id.action_splash_mvp_to_recursive)
        }
        view.findViewById<Button>(R.id.btn2).setOnClickListener {
            view.findNavController().navigate(R.id.action_splash_mvp_to_about_fragment)
        }
//        splashViewModel.getPokemonById("9").observe(viewLifecycleOwner, Observer {
//            it?.let {
//
//        }
//        })

    }

}
