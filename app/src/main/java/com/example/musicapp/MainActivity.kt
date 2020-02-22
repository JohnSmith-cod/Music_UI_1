package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       btn_play.setOnClickListener {
           val animation=AnimationUtils.loadAnimation(this,R.anim.rotation)
           img_music.startAnimation(animation)
           btn_play.setImageResource(R.drawable.ic_pause)
       }
    }
}
