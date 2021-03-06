package com.example.calc.part5_cats_breed

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.calc.R
import kotlinx.android.synthetic.main.activity_cat_breed.*
import java.io.IOException
import java.io.InputStream


class CatBreed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_breed)
        // val linearLayoutManager = LinearLayoutManager(applicationContext)
        //  linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = LinearLayoutManager(this)

        val cats = ArrayList<Cat>()

        addAllBreeds(cats)
        val adapter = TagsAdapter(cats)
        recyclerView.adapter = adapter

        var isGridLayout = false;

        buttonSetActivity.setOnClickListener {
            if (!isGridLayout) {
                isGridLayout = toOneColumn(isGridLayout)
            } else if (isGridLayout) {
                isGridLayout = toTwoColumns(isGridLayout)
            }
        }

    }

    private fun toOneColumn(isGridLayout: Boolean): Boolean {
<<<<<<< HEAD
        recyclerView.layoutManager = GridLayoutManager(this, 2)
=======
        tagsRV.layoutManager = GridLayoutManager(this, 2)
>>>>>>> d9002ebbcf5d3537f5a2c2c3cb792ed1f41ab8de
        buttonSetActivity.text = getString(R.string.column1)
        return !isGridLayout
    }

    private fun toTwoColumns(isGridLayout: Boolean): Boolean {
<<<<<<< HEAD
        recyclerView.layoutManager = LinearLayoutManager(this)
=======
        tagsRV.layoutManager = LinearLayoutManager(this)
>>>>>>> d9002ebbcf5d3537f5a2c2c3cb792ed1f41ab8de
        buttonSetActivity.text = getString(R.string.column2)
        return !isGridLayout

    }


    private fun addAllBreeds(cats: ArrayList<Cat>) {
        val amerCatDescription = assets.open("amer_cat_description.txt").bufferedReader().use {
            it.readText()
        }
        val britishCatDescription = assets.open("british_cat_description.txt").bufferedReader().use {
            it.readText()
        }
        val persCatDescription = assets.open("pers_cat_description.txt").bufferedReader().use {
            it.readText()
        }
        val savanaCatDescription = assets.open("savana_cat_description.txt").bufferedReader().use {
            it.readText()
        }

        Cat(getAssetsBitmap("amer_cat.jpg"), amerCatDescription).let { cats.add(it) }
        Cat(getAssetsBitmap("british_cat.jpg"), britishCatDescription).let { cats.add(it) }
        Cat(getAssetsBitmap("pers_cat.jpg"), persCatDescription).let { cats.add(it) }
        Cat(getAssetsBitmap("savana_cat.jpg"), savanaCatDescription).let { cats.add(it) }

    }


    private fun Context.getAssetsBitmap(path: String): Bitmap {
        val inputStream: InputStream
        var bitmap: Bitmap? = null
        try {
            inputStream = assets.open(path)
            bitmap = BitmapFactory.decodeStream(inputStream)
        } catch (e: IOException) {
            // Handle exception here
        }

        return bitmap!!
    }


}