package com.vacuum.androidmvp.ui.login

import com.vacuum.androidmvp.model.LoginInteractor

    class LoginPresenter(var loginView: LoginMvpView?, val loginInteractor: LoginInteractor) :
            LoginMvpPresenter {

        fun validateCredentials(username: String, password: String) {
            loginView?.showProgress()
            loginInteractor.login(username, password, this)
        }

        fun onDestroy() {
            loginView = null
        }

        override fun onUsernameError() {
            loginView?.apply {
                setUsernameError()
                hideprogress()
            }
        }

        override fun onPasswordError() {
            loginView?.apply {
                setPasswordError()
                hideprogress()
            }
        }

        override fun onSuccess() {
            loginView?.navigateToHome()
        }
    }