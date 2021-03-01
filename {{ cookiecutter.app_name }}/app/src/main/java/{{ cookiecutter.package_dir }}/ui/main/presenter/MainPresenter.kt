package {{ cookiecutter.package_name }}.ui.main.presenter

import {{ cookiecutter.package_name }}.ui.base.presenter.BasePresenter
import {{ cookiecutter.package_name }}.ui.main.interactor.MainMVPInteractor
import {{ cookiecutter.package_name }}.ui.main.view.MainMVPView
import {{ cookiecutter.package_name }}.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class MainPresenter<V : MainMVPView, I : MainMVPInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenter<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), MainMVPPresenter<V, I> {

    override fun onAttach(view: V?) {
        super.onAttach(view)
        getUserData()
        getQuestionCards()
    }

    override fun refreshQuestionCards() = getQuestionCards()

    override fun onDrawerOptionRateUsClick() = getView()?.openRateUsDialog()

    override fun onDrawerOptionFeedClick() = getView()?.openFeedActivity()

    override fun onDrawerOptionAboutClick() = getView()?.openAboutFragment()

    override fun onDrawerOptionLogoutClick() {
        getView()?.showProgress()
        interactor?.let {
            compositeDisposable.add(
                    it.makeLogoutApiCall()
                            .compose(schedulerProvider.ioToMainObservableScheduler())
                            .subscribe({
                                interactor?.performUserLogout()
                                getView()?.let {
                                    it.hideProgress()
                                    it.openLoginActivity()
                                }
                            }, { err -> println(err) }))
        }

    }

    private fun getQuestionCards() = interactor?.let {
        compositeDisposable.add(it.getQuestionCardData()
                .compose(schedulerProvider.ioToMainSingleScheduler())
                .subscribe({ questionCard ->
                    getView()?.let {
                        if (questionCard.isEmpty()) return@subscribe
                        else it.displayQuestionCard(questionCard)
                    }
                }, { err -> println(err) }))
    }


    private fun getUserData() = interactor?.let {
        val userData = it.getUserDetails()
        getView()?.inflateUserDetails(userData)
    }

}