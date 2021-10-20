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
        var rTv = findViewById<TextView>(R.id.tv_r)
        var realTv = findViewById<TextView>(R.id.tv_real)
        var btn = findViewById<Button>(R.id.button)
        var btn2 = findViewById<Button>(R.id.button2)


        btn.setOnClickListener {
            var vis  = AlphaAnimation(0f,1f)
            var gon = AlphaAnimation(1f,0f)
            vis.duration = 1000;
            gon.duration =1000;
            rTv.visibility =View.VISIBLE
            dTv.visibility = View.VISIBLE
            realTv.visibility = View.GONE
            dTv.animation = vis;
            rTv.animation =vis;
            realTv.animation = gon;

        }
        btn2.setOnClickListener{
            dTv.visibility = View.GONE
            rTv.visibility = View.GONE
            realTv.visibility = View.VISIBLE
        }
    }
}