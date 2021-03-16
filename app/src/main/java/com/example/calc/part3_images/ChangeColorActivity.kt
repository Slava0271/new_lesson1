package com.example.calc.part3_images

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.calc.R
import kotlinx.android.synthetic.main.activity_change_color.*


class ChangeColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_color)
        Glide.with(this).load("https://ru.wikipedia.org/wiki/SVG#/media/%D0%A4%D0%B0%D0%B9%D0%BB:SVG_logo.svg").into(changeImage)

    }
}