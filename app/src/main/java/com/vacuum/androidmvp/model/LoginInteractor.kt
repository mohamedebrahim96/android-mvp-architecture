package com.vacuum.androidmvp.model

import com.vacuum.androidmvp.ui.login.LoginMvpPresenter
import com.vacuum.androidmvp.ui.login.LoginPresenter
import com.vacuum.androidmvp.utils.postDelayed

class LoginInteractor {

    fun login(username: String, password: String, listener: LoginMvpPresenter) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        postDelayed(2000) {
            when {
                username.isEmpty() -> listener.onUsernameError()
                password.isEmpty() -> listener.onPasswordError()
                else -> listener.onSuccess()
            }
        }
    }
}