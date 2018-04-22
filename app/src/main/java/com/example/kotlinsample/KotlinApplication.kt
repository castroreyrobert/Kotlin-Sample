package com.example.kotlinsample

import android.app.Application

class KotlinApplication : Application() {

     var appComponent: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()
        injectDagger()
    }

    private fun injectDagger() {
        appComponent = DaggerApplicationComponent.builder().build()
        appComponent?.inject(this)
    }

    fun getComponent() : ApplicationComponent? {
        return appComponent
    }

}