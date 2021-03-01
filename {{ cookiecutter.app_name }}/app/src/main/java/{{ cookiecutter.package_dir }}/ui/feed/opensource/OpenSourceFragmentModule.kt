package {{ cookiecutter.package_name }}.ui.feed.opensource

import android.support.v7.widget.LinearLayoutManager
import {{ cookiecutter.package_name }}.ui.feed.opensource.interactor.OpenSourceInteractor
import {{ cookiecutter.package_name }}.ui.feed.opensource.interactor.OpenSourceMVPInteractor
import {{ cookiecutter.package_name }}.ui.feed.opensource.presenter.OpenSourceMVPPresenter
import {{ cookiecutter.package_name }}.ui.feed.opensource.presenter.OpenSourcePresenter
import {{ cookiecutter.package_name }}.ui.feed.opensource.view.OpenSourceAdapter
import {{ cookiecutter.package_name }}.ui.feed.opensource.view.OpenSourceFragment
import {{ cookiecutter.package_name }}.ui.feed.opensource.view.OpenSourceMVPView
import dagger.Module
import dagger.Provides

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Module
class OpenSourceFragmentModule {

    @Provides
    internal fun provideOpenSourceInteractor(interactor: OpenSourceInteractor): OpenSourceMVPInteractor = interactor

    @Provides
    internal fun provideOpenSourcePresenter(presenter: OpenSourcePresenter<OpenSourceMVPView, OpenSourceMVPInteractor>)
            : OpenSourceMVPPresenter<OpenSourceMVPView, OpenSourceMVPInteractor> = presenter

    @Provides
    internal fun provideOpenSourceAdapter(): OpenSourceAdapter = OpenSourceAdapter(ArrayList())

    @Provides
    internal fun provideLinearLayoutManager(fragment: OpenSourceFragment): LinearLayoutManager = LinearLayoutManager(fragment.activity)


}