package com.example.kotlinsample

import com.example.kotlinsample.base.BasePresenter

class MainActivityPresenter : BasePresenter<MainActivityContract.View>(), MainActivityContract.Presenter {
    private val mListItem = arrayListOf<Person>()

    override fun onButtonClicked() {
        addItemsToTheList();
        t?.populateList(mListItem)
    }

    fun addItemsToTheList(){
        for (i in 0 until 5) {
            val person = Person();
            person.age = 26
            person.firstName="Rey"
            person.lastName="Castro"
            mListItem.add(person)
        }
    }
}