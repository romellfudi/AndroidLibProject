package {{ cookiecutter.package_name }}.data.database.repository.options

import io.reactivex.Observable
import io.reactivex.Single

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface OptionsRepo {

    fun isOptionsRepoEmpty(): Observable<Boolean>

    fun insertOptions(options: List<Options>): Observable<Boolean>

    fun loadOptions(questionId: Long): Single<List<Options>>

}