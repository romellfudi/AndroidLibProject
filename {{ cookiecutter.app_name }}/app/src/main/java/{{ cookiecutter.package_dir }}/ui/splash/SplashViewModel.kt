package {{ cookiecutter.package_name }}.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import {{ cookiecutter.package_name }}.data.PersonDAO
import {{ cookiecutter.package_name }}.model.Person

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
class SplashViewModel(private val pokemonDAO: PersonDAO) : ViewModel() { 

    fun getPokemonById(id: String?): LiveData<Person> {
        return pokemonDAO.getById(id)
    }

    fun getPokemonEvolutionsByIds(ids: List<String>): LiveData<List<Person>> {
        return pokemonDAO.getEvolutionsByIds(ids)
    }
}