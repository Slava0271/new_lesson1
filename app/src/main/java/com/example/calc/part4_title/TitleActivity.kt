package com.example.calc.part4_title

import android.graphics.Outline
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import com.example.calc.R
import kotlinx.android.synthetic.main.activity_title.*

class TitleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title)
        supportActionBar?.hide()
        setAvatarPhoto()
        setTextSize()
        setTextSize()
    }
    private fun setAvatarPhoto(){
        imageViewAvatar.setImageResource(R.drawable.ic_launcher_foreground)
    }
    private fun setTextSize(){
        title1Text.setTextSize(TypedValue.COMPLEX_UNIT_PX,85f)
        title2Text.setTextSize(TypedValue.COMPLEX_UNIT_PX,85f)
        title3Text.setTextSize(TypedValue.COMPLEX_UNIT_PX,85f)
        title4Text.setTextSize(TypedValue.COMPLEX_UNIT_PX,60f)
        title5Text.setTextSize(TypedValue.COMPLEX_UNIT_PX,60f)
        title6Text.setTextSize(TypedValue.COMPLEX_UNIT_PX,60f)
        title7Text.setTextSize(TypedValue.COMPLEX_UNIT_PX,60f)

    }
}