package com.vacuum.androidmvp.ui.main

import com.vacuum.androidmvp.postDelayed

class FindItemsInteractor {

    fun findItems(callback: (List<String>) -> Unit) {
        postDelayed(2000) { callback(createArrayList()) }
    }

    private fun createArrayList(): List<String> = (1..10).map { "Item $it" }
}