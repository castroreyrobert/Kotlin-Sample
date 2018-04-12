package com.example.kotlinsample.base

abstract class BasePresenter<T> {
    var t : T? = null

    fun onAttached(t: T) {
        this.t = t
    }

    fun onDestroyView() {
        t = null
    }

}