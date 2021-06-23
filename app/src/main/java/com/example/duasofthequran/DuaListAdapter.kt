package com.example.duasofthequran

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView

class DuaListAdapter : RecyclerView.Adapter<RecyclerViewHolder>() {

    @Override
    override fun getItemViewType(position: Int): Int {
        return R.layout.list_item
    }

    @NonNull
    @Override
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType,parent,false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.textView.text = "a dua name"
    }

    override fun getItemCount(): Int {
        return 500
    }
}
