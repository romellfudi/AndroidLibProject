package {{ cookiecutter.package_name }}.di

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
val appComponent = listOf(
    databaseModule,
    viewModelsModule
)
