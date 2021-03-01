package {{ cookiecutter.package_name }}.data.database.repository.questions

import io.reactivex.Observable

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
interface QuestionRepo {

    fun isQuestionsRepoEmpty(): Observable<Boolean>

    fun insertQuestions(questions: List<Question>): Observable<Boolean>

    fun loadQuestions(): Observable<List<Question>>
}