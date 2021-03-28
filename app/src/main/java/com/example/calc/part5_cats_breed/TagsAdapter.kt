package com.example.calc.part5_cats_breed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.calc.R
import kotlinx.android.synthetic.main.cat_items.view.*

class TagsAdapter(private val cats: ArrayList<Cat>) : RecyclerView.Adapter<TagsAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tagTV: TextView = view.tagTV as TextView
        val imageCats: ImageView = view.image_cats
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.cat_items, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val cat = cats[position]

        holder.tagTV.text = cat.catDescription
        holder.imageCats.setImageBitmap(cat.catImg)

    }

    override fun getItemCount(): Int {
        return cats.size
    }

}