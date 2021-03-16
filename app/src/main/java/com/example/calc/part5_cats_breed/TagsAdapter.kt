package com.example.calc.part5_cats_breed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.calc.R

class TagsAdapter( private val cats: ArrayList<Cat>) : RecyclerView.Adapter<TagsAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tagTV: TextView = view.findViewById<View>(R.id.tagTV) as TextView
        val imageCats: ImageView = view.findViewById(R.id.image_cats)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.tags_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val tag = cats[position]
        val imgRes = cats[position]

        holder.tagTV.text = tag.des
        holder.imageCats.setImageBitmap(imgRes.catImg)

    }

    override fun getItemCount(): Int {
        return cats.size
    }

}