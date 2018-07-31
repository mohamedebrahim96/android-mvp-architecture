package com.vacuum.androidmvp.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.vacuum.androidmvp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,MainView{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun showProgress() {
        progress.visibility = View.VISIBLE
        list.visibility = View.GONE
    }

    override fun hideProgress() {
        progress.visibility = View.GONE
        list.visibility = View.VISIBLE
    }

    override fun setItems(items: List<String>) {
        list.adapter = MainAdapter(items, presenter::onItemClicked)
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }
}
