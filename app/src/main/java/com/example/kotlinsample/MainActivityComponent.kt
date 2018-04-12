package com.example.kotlinsample

import dagger.Component

@Component(modules = arrayOf(MainActivityModule::class))
interface MainActivityComponent {
    fun inject(mainActivity : MainActivity)
}