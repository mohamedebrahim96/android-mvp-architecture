package com.vacuum.androidmvp.ui.login

class LoginPresenter(var loginview:LoginView ,val logininteractor: LoginInteractor): LoginInteractor.OnLoginFinishedListener  {


    fun validateCredentials(username: String, password: String) {
        loginview?.showProgress()
        logininteractor.login(username, password, this)
    }

}