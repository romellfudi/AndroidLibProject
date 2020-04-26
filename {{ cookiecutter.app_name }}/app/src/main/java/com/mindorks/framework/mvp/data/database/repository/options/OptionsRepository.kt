package {{ cookiecutter.package_name }}.data.database.repository.options

import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by jyotidubey on 06/01/18.
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