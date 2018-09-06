package com.vacuum.androidmvp.model

import com.vacuum.androidmvp.utils.postDelayed

class MainInteractor {


    fun findItems(callback: (List<String>) -> Unit) {
        postDelayed(2000) { callback(createArrayList()) }
    }


    fun createArrayList(): List<String>{

        return (1..10).map { "Item $it" }
    }
}