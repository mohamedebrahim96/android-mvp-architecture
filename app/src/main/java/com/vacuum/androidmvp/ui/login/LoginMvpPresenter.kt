package com.vacuum.androidmvp.ui.login

interface LoginMvpPresenter {
    fun onUsernameError()
    fun onPasswordError()
    fun onSuccess()
}