package com.vacuum.androidmvp.ui.login

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.vacuum.androidmvp.ui.main.MainActivity
import com.vacuum.androidmvp.R
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity: AppCompatActivity(), LoginView {


    private val presenter = LoginPresenter(this,LoginInteractor())

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.login_activity)


        button.setOnClickListener { validateCredentials() }
    }

    private fun validateCredentials() {

    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

    override fun showProgress() {
        progress.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        progress.visibility = View.GONE
    }

    override fun setUsernameError() {
        username.error = "Error username"
    }

    override fun setPasswordError() {
        password.error = "Error paswword"
    }


    override fun navigateToHome() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}