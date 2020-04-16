package {{ cookiecutter.lib_package_name }};

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
abstract class DataResponse protected constructor(protected var data: String)