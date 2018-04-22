package com.example.kotlinsample

import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    fun provideMainActivityPresenter(): MainActivityPresenter {
        return MainActivityPresenter()
    }
}