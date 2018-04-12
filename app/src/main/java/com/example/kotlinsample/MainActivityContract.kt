package com.example.kotlinsample

interface MainActivityContract {
    interface View {
        fun populateList(list : List<Person>)
    }

    interface Presenter {
        fun onButtonClicked()
    }
}