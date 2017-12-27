package com.example.nyoun_000.diaryproject.view.main_view

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import com.example.nyoun_000.diaryproject.R
import com.example.nyoun_000.diaryproject.view.init_view.InitViewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        var mainImgAnimation = TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.05f,
                Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f)
        mainImgAnimation.duration = 2000
        img_main.startAnimation(mainImgAnimation)


        var intent = Intent(this, InitViewActivity::class.java)
        startActivity(intent)



    }
}
