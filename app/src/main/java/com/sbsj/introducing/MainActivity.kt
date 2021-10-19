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
        var dTv = findViewById<TextView>(R.id.tv_D)
        var btn = findViewById<Button>(R.id.button)
        var btn2 = findViewById<Button>(R.id.button2)


        btn.setOnClickListener {
            var vis  = AlphaAnimation(0f,1f)
            vis.duration = 1000;
            dTv.visibility = View.VISIBLE
            dTv.animation = vis;

        }
        btn2.setOnClickListener{
            dTv.visibility = View.GONE
        }
    }
}