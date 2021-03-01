package {{ cookiecutter.package_name }}.di.module

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import {{ cookiecutter.package_name }}.BuildConfig
import {{ cookiecutter.package_name }}.data.database.AppDatabase
import {{ cookiecutter.package_name }}.data.database.repository.options.OptionsRepo
import {{ cookiecutter.package_name }}.data.database.repository.options.OptionsRepository
import {{ cookiecutter.package_name }}.data.database.repository.questions.QuestionRepo
import {{ cookiecutter.package_name }}.data.database.repository.questions.QuestionRepository
import {{ cookiecutter.package_name }}.data.network.ApiHeader
import {{ cookiecutter.package_name }}.data.network.ApiHelper
import {{ cookiecutter.package_name }}.data.network.AppApiHelper
import {{ cookiecutter.package_name }}.data.preferences.AppPreferenceHelper
import {{ cookiecutter.package_name }}.data.preferences.PreferenceHelper
import {{ cookiecutter.package_name }}.di.ApiKeyInfo
import {{ cookiecutter.package_name }}.di.PreferenceInfo
import {{ cookiecutter.package_name }}.util.AppConstants
import {{ cookiecutter.package_name }}.util.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    internal fun provideAppDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, AppConstants.APP_DB_NAME).build()

    @Provides
    @ApiKeyInfo
    internal fun provideApiKey(): String = BuildConfig.API_KEY

    @Provides
    @PreferenceInfo
    internal fun provideprefFileName(): String = AppConstants.PREF_NAME

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppPreferenceHelper): PreferenceHelper = appPreferenceHelper

    @Provides
    @Singleton
    internal fun provideProtectedApiHeader(@ApiKeyInfo apiKey: String, preferenceHelper: PreferenceHelper)
            : ApiHeader.ProtectedApiHeader = ApiHeader.ProtectedApiHeader(apiKey = apiKey,
            userId = preferenceHelper.getCurrentUserId(),
            accessToken = preferenceHelper.getAccessToken())

    @Provides
    @Singleton
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper = appApiHelper

    @Provides
    @Singleton
    internal fun provideQuestionRepoHelper(appDatabase: AppDatabase): QuestionRepo = QuestionRepository(appDatabase.questionsDao())

    @Provides
    @Singleton
    internal fun provideOptionsRepoHelper(appDatabase: AppDatabase): OptionsRepo = OptionsRepository(appDatabase.optionsDao())

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProvider()


}