package com.example.kotlinsample

import android.app.Application
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainActivityContract.View{

    private var mAdapter: ArrayAdapter<String>? = null
    private var mListView: ListView? = null
    @Inject lateinit var mPresenter: MainActivityPresenter
    lateinit var component: MainActivityComponent
    private var mApplication: KotlinApplication? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mApplication = application as KotlinApplication
        val component = DaggerMainActivityComponent.builder().applicationComponent(mApplication?.getComponent()).build()
        component.inject(this)
        this.component  = component
        mPresenter.onAttached(this)
        mListView = findViewById(R.id.listViewPerson)
        mPresenter.onButtonClicked()

    }

    override fun populateList(list: List<String>) {
        mAdapter = ArrayAdapter(this, android.R.layout.activity_list_item, android.R.id.text1, list)
        mListView?.adapter = mAdapter
    }
}
