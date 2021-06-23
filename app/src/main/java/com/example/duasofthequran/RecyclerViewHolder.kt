package com.example.duasofthequran

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class RecyclerViewHolder(v:View) : RecyclerView.ViewHolder(v) {

    private var view: View = v
    val textView: TextView = view.findViewById<TextView>(R.id.tv_dua_list_item_name)


}