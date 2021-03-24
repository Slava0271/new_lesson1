package com.example.calc.part4_title

import android.content.Context
import android.graphics.Outline
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.TextView
import android.widget.TextView.AUTO_SIZE_TEXT_TYPE_NONE
import android.widget.TextView.AUTO_SIZE_TEXT_TYPE_UNIFORM
import androidx.annotation.RequiresApi
import com.example.calc.R
import kotlinx.android.synthetic.main.activity_title.*

class TitleActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title)
        supportActionBar?.hide()
        setAvatarPhoto()

    }

    private fun setAvatarPhoto() {
        imageViewAvatar.setImageResource(R.drawable.ic_launcher_foreground)
    }


}


