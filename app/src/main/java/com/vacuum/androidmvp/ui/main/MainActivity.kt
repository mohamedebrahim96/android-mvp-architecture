package com.vacuum.androidmvp.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.vacuum.androidmvp.R
import com.vacuum.androidmvp.model.MainInteractor
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :AppCompatActivity(),MainMvpView {


    private val presenter = MainPresenter(this, MainInteractor())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

    override fun showprogress() {
        progress.visibility = View.VISIBLE
    }

    override fun hideprogress() {
        progress.visibility = View.INVISIBLE

    }

    override fun setitems(items: List<String>) {
        list.adapter = MainAdapter(items, presenter::onItemClicked)

    }

    override fun setmessage(Str: String) {
        Toast.makeText(this,Str,Toast.LENGTH_LONG).show()
    }
}