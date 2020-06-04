package com.example.task3appdevelopment.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.task3appdevelopment.R

import com.example.task3appdevelopment.model.LangItem

class LangAdapters(var context: Context, var arrayList: ArrayList<LangItem>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View = View.inflate(context, R.layout.task_3_grid, null)
        var images:ImageView = view.findViewById(R.id.images)
        var names:TextView = view.findViewById((R.id.text_view))

        var listItem:LangItem = arrayList.get(position)

        images.setImageResource(listItem.icons!!)
        names.text = listItem.name

        return view
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }
}


