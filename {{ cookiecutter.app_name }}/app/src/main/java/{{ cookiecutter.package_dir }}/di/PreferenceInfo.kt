package {{ cookiecutter.package_name }}.di

import javax.inject.Qualifier

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Qualifier
@Retention annotation class PreferenceInfo