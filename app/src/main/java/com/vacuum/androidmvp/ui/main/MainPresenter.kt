package com.vacuum.androidmvp.ui.main

import com.vacuum.androidmvp.model.MainInteractor

class MainPresenter(var view: MainMvpView?,val mainInteractor: MainInteractor):MainMvpPresenter {





    fun onResume(){
        view?.showprogress()
        mainInteractor.findItems(::onItemsLoaded)
    }
    private fun onItemsLoaded(items: List<String>) {
        view?.apply {
            setitems(items)
            hideprogress()
        }
    }

    fun onItemClicked(item: String) {
        view?.setmessage(item)
    }

    fun onDestroy(){
        view = null
    }
}
