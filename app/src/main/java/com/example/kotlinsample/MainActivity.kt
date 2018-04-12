package com.example.kotlinsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity(), MainActivityContract.View{

    private var mAdapter: ArrayAdapter<Person>? = null
    private var mListView: ListView? = null
    private var mPresenter: MainActivityPresenter? = null
    private var mListItem: List<Person>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter?.onAttached(this)
        mListView = findViewById(R.id.listViewPerson)
        mPresenter = MainActivityPresenter()
        mListItem = ArrayList()
        mAdapter = ArrayAdapter(this, android.R.layout.activity_list_item, mListItem)
        mListView?.adapter = mAdapter

    }

    override fun populateList(list: List<Person>) {
        mListItem = list
        mAdapter?.notifyDataSetChanged()
    }
}
