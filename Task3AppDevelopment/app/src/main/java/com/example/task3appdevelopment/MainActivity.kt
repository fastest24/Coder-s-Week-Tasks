package com.example.task3appdevelopment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import android.widget.Toast
import com.example.task3appdevelopment.adapters.LangAdapters
import com.example.task3appdevelopment.model.LangItem

class MainActivity : AppCompatActivity() , OnItemClickListener{

    private var arrayList:ArrayList<LangItem> ?= null
    private var gridView:GridView ? = null
    private var langAdapters:LangAdapters ? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.nm)
        arrayList = ArrayList()
        arrayList = setDataList()
        langAdapters = LangAdapters(applicationContext, arrayList!!)
        gridView?.adapter = langAdapters
        gridView?.onItemClickListener = this
    }

    private fun setDataList(): ArrayList<LangItem>{

        var arrayList: ArrayList<LangItem> = ArrayList()
        arrayList.add(LangItem(R.drawable.ic_launcher_background, "Back"))
        arrayList.add(LangItem(R.drawable.ic_launcher_foreground, "Front"))
        return arrayList
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var items:LangItem = arrayList!!.get(position)
        Toast.makeText(applicationContext, items.name, Toast.LENGTH_LONG).show()
    }
}