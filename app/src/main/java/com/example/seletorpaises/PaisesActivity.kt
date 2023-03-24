package com.example.seletorpaises

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.seletorpaises.Pais
class PaisesActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paises)
        supportActionBar?.hide()

        val nomePais = intent.getStringExtra("Pais")

        var btnPesquisaPais = findViewById<Button>(R.id.btnVoltar)
        var txtNomePais = findViewById<TextView>(R.id.txtNomePais)
        var txtPopulacaoPais = findViewById<TextView>(R.id.txtPopulacaoPais)
        var txtAreaPais = findViewById<TextView>(R.id.txtAreaPais)
        var txtLocalizacaoPais = findViewById<TextView>(R.id.txtLocalizacaoPais)
        var imgBandeira = findViewById<ImageView>(R.id.imgBandeira)
        var imgMapa = findViewById<ImageView>(R.id.imgMapa)

        when(nomePais){
            "Brasil" -> {
                txtLocalizacaoPais.setText("América do Sul")
                txtAreaPais.setText("8.516.000 km²")
                txtPopulacaoPais.setText("214,3 milhões")
                txtNomePais.setText(nomePais)
                imgBandeira.setImageResource(R.drawable.brasil)
                imgMapa.setImageResource(R.drawable.mapa_brasil)
            }
            "Indía" -> {
                txtLocalizacaoPais.setText("Ásia")
                txtAreaPais.setText("3.287.000 km²")
                txtPopulacaoPais.setText("1,408 bilhão")
                txtNomePais.setText(nomePais)
                imgBandeira.setImageResource(R.drawable.india)
                imgMapa.setImageResource(R.drawable.mapa_india)
            }
            "Papoa Nova Guiné" -> {
                txtLocalizacaoPais.setText("Oceania")
                txtAreaPais.setText("462.840 km²")
                txtPopulacaoPais.setText("9,949 milhões")
                txtNomePais.setText(nomePais)
                imgBandeira.setImageResource(R.drawable.papoanovaguine)
                imgMapa.setImageResource(R.drawable.mapa_papoanovaguine)
            }
            "México" -> {
                txtLocalizacaoPais.setText("América do Norte")
                txtAreaPais.setText("1.973.000 km²")
                txtPopulacaoPais.setText("129,6 milhões")
                txtNomePais.setText(nomePais)
                imgBandeira.setImageResource(R.drawable.mexico)
                imgMapa.setImageResource(R.drawable.mapa_mexico)
            }
            "Holanda" -> {
                txtLocalizacaoPais.setText("Europa")
                txtAreaPais.setText("41.850 km²")
                txtPopulacaoPais.setText("17,53 milhões")
                txtNomePais.setText(nomePais)
                imgBandeira.setImageResource(R.drawable.holanda)
                imgMapa.setImageResource(R.drawable.mapa_holanda)
            }
            "Austrália" -> {
                txtLocalizacaoPais.setText("Oceania")
                txtAreaPais.setText("7.688.000 km²")
                txtPopulacaoPais.setText("25,69 milhões")
                txtNomePais.setText(nomePais)
                imgBandeira.setImageResource(R.drawable.australia)
                imgMapa.setImageResource(R.drawable.mapa_australia)
            }
        }

        btnPesquisaPais.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            finish()
            startActivity(i)
        }
    }
}