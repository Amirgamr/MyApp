package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startBtn = findViewById<Button>(R.id.btnStartAnotherActivity)
        startBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, StartActivity::class.java))
        }
        val startBton = findViewById<Button>(R.id.buttonlist)
        startBton.setOnClickListener {
            startActivity(Intent(this@MainActivity, ListActivity::class.java))
        }
        findViewById<SwitchCompat>(R.id.switch3).setOnClickListener {
            if ((it as SwitchCompat).isChecked) {
                findViewById<View>(R.id.mainView).setBackgroundColor(Color.BLACK)
            } else {
                findViewById<View>(R.id.mainView).setBackgroundColor(Color.WHITE)
            }
        }
    }
}