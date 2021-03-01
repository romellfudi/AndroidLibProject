package {{ cookiecutter.package_name }}.ui.login.presenter

import {{ cookiecutter.package_name }}.data.network.LoginResponse
import {{ cookiecutter.package_name }}.ui.base.presenter.BasePresenter
import {{ cookiecutter.package_name }}.ui.login.interactor.LoginMVPInteractor
import {{ cookiecutter.package_name }}.ui.login.view.LoginMVPView
import {{ cookiecutter.package_name }}.util.AppConstants
import {{ cookiecutter.package_name }}.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Consumer
import javax.inject.Inject

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class LoginPresenter<V : LoginMVPView, I : LoginMVPInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), LoginMVPPresenter<V, I> {

    override fun onServerLoginClicked(email: String, password: String) {
        when {
            email.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_EMAIL_ERROR)
            password.isEmpty() -> getView()?.showValidationMessage(AppConstants.EMPTY_PASSWORD_ERROR)
            else -> {
                getView()?.showProgress()
                interactor?.let {
                    compositeDisposable.add(it.doServerLoginApiCall(email, password)
                            .compose(schedulerProvider.ioToMainObservableScheduler())
                            .subscribe({ loginResponse ->
                                updateUserInSharedPref(loginResponse = loginResponse,
                                        loggedInMode = AppConstants.LoggedInMode.LOGGED_IN_MODE_SERVER)
                                getView()?.openMainActivity()
                            }, { err -> println(err) }))
                }

            }
        }
    }

    override fun onFBLoginClicked() {
        getView()?.showProgress()
        interactor?.let {
            compositeDisposable.add(it.doFBLoginApiCall()
                    .compose(schedulerProvider.ioToMainObservableScheduler())
                    .subscribe({ loginResponse ->
                        updateUserInSharedPref(loginResponse = loginResponse,
                                loggedInMode = AppConstants.LoggedInMode.LOGGED_IN_MODE_FB)
                        getView()?.let {
                            it.hideProgress()
                            it.openMainActivity()
                        }
                    }, { err -> println(err) }))
        }


    }

    override fun onGoogleLoginClicked() {
        getView()?.showProgress()
        interactor?.let {
            compositeDisposable.add(it.doGoogleLoginApiCall()
                    .compose(schedulerProvider.ioToMainObservableScheduler())
                    .subscribe({ loginResponse ->
                        updateUserInSharedPref(loginResponse = loginResponse,
                                loggedInMode = AppConstants.LoggedInMode.LOGGED_IN_MODE_GOOGLE)
                        getView()?.let {
                            it.hideProgress()
                            it.openMainActivity()
                        }
                    }, { err -> println(err) }))
        }

    }

    private fun updateUserInSharedPref(loginResponse: LoginResponse,
                                       loggedInMode: AppConstants.LoggedInMode) =
            interactor?.updateUserInSharedPref(loginResponse, loggedInMode)


}