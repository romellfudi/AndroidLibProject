package {{ cookiecutter.package_name }}.ui.main.interactor

import {{ cookiecutter.package_name }}.data.database.repository.options.Options
import {{ cookiecutter.package_name }}.data.database.repository.questions.Question

/**
 * Created by jyotidubey on 08/01/18.
 */
data class QuestionCardData(val option: List<Options>, val question: Question)