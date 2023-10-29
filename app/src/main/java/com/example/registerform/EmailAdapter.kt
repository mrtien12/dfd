package com.example.registerform

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

data class ItemModel(val avatar: String, val nickname: String, val title: String, val content: String, val time: String)
class EmailAdapter(val items:ArrayList<ItemModel>): BaseAdapter(){
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(p0: Int): Any {
        return items[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val row: View = LayoutInflater.from(p2?.context).inflate(R.layout.email_item,p2,false)
        row.findViewById<TextView>(R.id.avatar).text = items[p0].avatar
        row.findViewById<TextView>(R.id.nickname).text = items[p0].nickname
        row.findViewById<TextView>(R.id.title).text = items[p0].title
        row.findViewById<TextView>(R.id.content).text = items[p0].content
        row.findViewById<TextView>(R.id.time).text = items[p0].time
        return row
    }
}