package com.example.seletorpaises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PaisesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paises)
        supportActionBar?.hide()
    }
}