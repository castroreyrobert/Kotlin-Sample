package com.example.kotlinsample

import android.app.Application
import dagger.BindsInstance
import dagger.Component

@Component(modules = [(ApplicationModule::class)])
interface ApplicationComponent {

    fun inject(application: Application)
}