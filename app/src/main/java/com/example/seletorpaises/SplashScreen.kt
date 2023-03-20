package com.example.seletorpaises

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()

        val image = findViewById<ImageView>(R.id.logoSplash)

        image.alpha = 0f
        image.animate().setDuration(1500).alpha(1f).withEndAction{
            val i = Intent(this, LoginActivity::class.java)
            overridePendingTransition(android.R.anim.linear_interpolator, android.R.anim.fade_out)
            finish()
            startActivity(i)
        }
    }
}