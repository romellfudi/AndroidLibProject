package {{ cookiecutter.package_name }}.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import {{ cookiecutter.package_name }}.data.PersonDAO
import {{ cookiecutter.package_name }}.model.Person

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class AboutViewModel(private val pokemonDAO: PersonDAO) : ViewModel() {

    fun getPokemonById(id: String?): LiveData<Person> {
        return pokemonDAO.getById(id)
    }

    fun getPokemonEvolutionsByIds(ids: List<String>): LiveData<List<Person>> {
        return pokemonDAO.getEvolutionsByIds(ids)
    }
}