package {{ cookiecutter.package_name }}.data.database.repository.questions

import io.reactivex.Observable
import javax.inject.Inject

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class QuestionRepository @Inject internal constructor(private val questionsDao: QuestionsDao) : QuestionRepo {

    override fun isQuestionsRepoEmpty(): Observable<Boolean> = Observable.fromCallable({ questionsDao.loadAll().isEmpty() })

    override fun insertQuestions(questions: List<Question>): Observable<Boolean> {
        questionsDao.insertAll(questions)
        return Observable.just(true)
    }

    override fun loadQuestions(): Observable<List<Question>> = Observable.fromCallable({ questionsDao.loadAll() })
}


