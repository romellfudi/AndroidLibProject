package {{ cookiecutter.package_name }}.ui.main.interactor

import {{ cookiecutter.package_name }}.data.database.repository.options.Options
import {{ cookiecutter.package_name }}.data.database.repository.questions.Question

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
data class QuestionCardData(val option: List<Options>, val question: Question)