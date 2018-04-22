package com.example.kotlinsample

import com.example.kotlinsample.base.BasePresenter

class MainActivityPresenter : BasePresenter<MainActivityContract.View>(), MainActivityContract.Presenter {
    private val mListItem = arrayListOf<String>()

    override fun onButtonClicked() {
        addItemsToTheList()
        t?.populateList(mListItem)
    }

    fun addItemsToTheList(){
        for (i in 0 until 5) {
            mListItem.add("Rey")
        }
    }
}