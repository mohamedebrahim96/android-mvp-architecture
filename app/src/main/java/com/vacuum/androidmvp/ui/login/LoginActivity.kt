package com.vacuum.androidmvp.ui.login

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.vacuum.androidmvp.R
import com.vacuum.androidmvp.model.LoginInteractor
import com.vacuum.androidmvp.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginMvpView {

    private val presenter = LoginPresenter(this, LoginInteractor())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button.setOnClickListener { validateCredentials() }
    }

    private fun validateCredentials() {
        presenter.validateCredentials(username.text.toString(), password.text.toString())
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

    override fun showProgress() {
        progress.visibility = View.VISIBLE
    }

    override fun hideprogress() {
        progress.visibility = View.GONE
    }

    override fun setUsernameError() {
        username.error = "username_error"
    }

    override fun setPasswordError() {
        password.error = "password_error"
    }

    override fun navigateToHome() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}