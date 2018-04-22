package com.example.kotlinsample

import dagger.Component

@Component(modules = [(MainActivityModule::class)],
        dependencies = [(ApplicationComponent::class)])
interface MainActivityComponent {
    fun inject(mainActivity : MainActivity)
}