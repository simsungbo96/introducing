package com.sbsj.introducing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var realTv = findViewById<TextView>(R.id.tv_Real)
        var dTv = findViewById<TextView>(R.id.tv_D)
        var eveTv = findViewById<TextView>(R.id.tv_eveloper)
        var btn = findViewById<Button>(R.id.button)


        btn.setOnClickListener {
            var vis  = AlphaAnimation(0f,1f)
            var gon  = AlphaAnimation(1f,0f)
            vis.duration = 1000;
            gon.duration = 1000;
            eveTv.visibility = View.VISIBLE
            realTv.visibility = View.GONE
            eveTv.animation = vis;
            realTv.animation = gon
        }
    }
}