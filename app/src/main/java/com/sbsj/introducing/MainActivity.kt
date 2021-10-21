package com.sbsj.introducing

import android.animation.ObjectAnimator
import android.opengl.Visibility
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dTv = findViewById<TextView>(R.id.tv_D)
        var realTv = findViewById<TextView>(R.id.tv_real)
        var onBtn = findViewById<Button>(R.id.btn_on)
        var checkEt = findViewById<TextView>(R.id.et_checkNumber)



        onBtn.setOnClickListener {
            etClick(dTv)
            etClick(realTv)
            onBtn.visibility =View.VISIBLE
        }


    }


    fun etClick(text:TextView)
    {

        ObjectAnimator.ofFloat(text, "translationY", 490f).apply {
            duration = 1000
            start()
            Log.e("시작", "onCreate: ")


        }


    }
    fun etClick2(text:TextView)
    {
        ObjectAnimator.ofFloat(text, "translationY", -490f).apply {
            duration = 100
            start()
            Log.e("시작", "onCreate: ")
        }



    }
}