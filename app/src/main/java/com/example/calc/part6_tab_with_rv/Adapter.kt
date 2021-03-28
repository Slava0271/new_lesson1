package com.example.calc.part6_tab_with_rv

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.calc.R
import kotlinx.android.synthetic.main.tags_item.view.*

class Adapter(private val text: ArrayList<String>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tagTV: TextView = view.tagTV as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tags_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val text = text[position]
        holder.tagTV.text = text

    }

    override fun getItemCount(): Int {
        return text.size
    }

}