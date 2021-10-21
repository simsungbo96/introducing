package com.sbsj.introducing


import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import android.util.Pair as UtilPair
import android.view.View
import android.view.animation.AlphaAnimation
import android.widget.TextView


class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dTv = findViewById<TextView>(R.id.tv_D)
        val rearTv = findViewById<TextView>(R.id.tv_real)
        val vis = AlphaAnimation(0f, 1f)
        intent = Intent(applicationContext,MainActivity::class.java)




        vis.duration = 1500;
        dTv.visibility = View.VISIBLE
        dTv.animation = vis;




        rearTv.setOnClickListener {
            val options = ActivityOptions.makeSceneTransitionAnimation(
                this@IntroActivity,
                UtilPair.create(dTv, "dTvTransition"),
                UtilPair.create(rearTv, "realTvTransition"))
            startActivity(intent, options.toBundle())

        }


    }
}