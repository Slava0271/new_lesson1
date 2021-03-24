package com.example.calc.part4_title

<<<<<<< HEAD
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
=======
import android.graphics.Outline
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
>>>>>>> d9002ebbcf5d3537f5a2c2c3cb792ed1f41ab8de
import com.example.calc.R
import kotlinx.android.synthetic.main.activity_title.*

class TitleActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title)
        supportActionBar?.hide()
        setAvatarPhoto()
<<<<<<< HEAD

=======
        setTextSize()
        setTextSize()
>>>>>>> d9002ebbcf5d3537f5a2c2c3cb792ed1f41ab8de
    }

    private fun setAvatarPhoto() {
        imageViewAvatar.setImageResource(R.drawable.ic_launcher_foreground)
    }
<<<<<<< HEAD


}


=======
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
>>>>>>> d9002ebbcf5d3537f5a2c2c3cb792ed1f41ab8de
