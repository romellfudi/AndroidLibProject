package {{ cookiecutter.package_name }}.data.database.repository.options

import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class OptionsRepository @Inject constructor(private val optionsDao: OptionsDao) : OptionsRepo {

    override fun isOptionsRepoEmpty(): Observable<Boolean> = Observable.just(optionsDao.loadAll().isEmpty())

    override fun insertOptions(options: List<Options>): Observable<Boolean> {
        optionsDao.insertAll(options)
        return Observable.just(true)
    }

    override fun loadOptions(questionId: Long): Single<List<Options>>
            = Single.fromCallable({ optionsDao.loadOptionsByQuestionId(questionId) })

}