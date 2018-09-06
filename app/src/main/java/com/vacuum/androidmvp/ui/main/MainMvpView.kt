package com.vacuum.androidmvp.ui.main

interface MainMvpView {

    fun showprogress()
    fun hideprogress()
    fun setitems(strings :List<String>)
    fun setmessage(str:String)

}