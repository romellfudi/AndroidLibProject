package {{ cookiecutter.package_name }}.di

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
val appComponent = listOf(
    databaseModule,
    viewModelsModule
)
