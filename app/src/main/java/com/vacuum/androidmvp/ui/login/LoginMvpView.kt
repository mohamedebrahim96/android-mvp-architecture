package com.vacuum.androidmvp.ui.login

interface LoginMvpView  {

    fun showProgress()
    fun hideprogress()
    fun setUsernameError()
    fun setPasswordError()
    fun navigateToHome()
}