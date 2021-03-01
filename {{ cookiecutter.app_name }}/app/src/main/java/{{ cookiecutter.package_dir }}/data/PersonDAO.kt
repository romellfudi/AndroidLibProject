package {{ cookiecutter.package_name }}.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import {{ cookiecutter.package_name }}.model.Person

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Dao
interface PersonDAO {

    @Query("SELECT * FROM person WHERE id = :id")
    fun getById(id: String?): LiveData<Person>

    @Query("SELECT * FROM person WHERE id IN(:evolutionIds)")
    fun getEvolutionsByIds(evolutionIds: List<String>): LiveData<List<Person>>

    @Query("SELECT * FROM person")
    fun all(): LiveData<List<Person>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun add(pokemon: List<Person>)

    @Query("DELETE FROM person")
    fun deleteAll()

    @Delete
    fun delete(model: Person)
}
