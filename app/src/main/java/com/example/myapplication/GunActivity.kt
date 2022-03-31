package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GunActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gun)

        findViewById<Button>(R.id.M13).setOnClickListener {
            startActivity(Intent(this@GunActivity, m13activity::class.java))
        }
        findViewById<Button>(R.id.fennec).setOnClickListener {
            startActivity(Intent(this@GunActivity, feenecactivity::class.java))
        }
        findViewById<Button>(R.id.QQ9).setOnClickListener {
            startActivity(Intent(this@GunActivity, QQ9activity::class.java))
        }
        findViewById<Button>(R.id.HS0405).setOnClickListener {
            startActivity(Intent(this@GunActivity, Hs0405activity::class.java))
        }

        findViewById<Button>(R.id.locus).setOnClickListener {
            startActivity(Intent(this@GunActivity, Locusactivity::class.java))
        }
    }
}