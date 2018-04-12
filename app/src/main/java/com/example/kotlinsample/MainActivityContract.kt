package com.example.kotlinsample

interface MainActivityContract {
    interface View {
        fun populateList(list : List<String>)
    }

    interface Presenter {
        fun onButtonClicked()
    }
}