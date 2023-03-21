package com.example.seletorpaises

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val ListaPaises: List<String> = listOf("Brasil", "Indía", "Holanda", "México", "Papoa Nova Guiné", "Austrália")
        var btnPesquisa = findViewById<Button>(R.id.btnPesquisaPais)
        var pais = findViewById<EditText>(R.id.editTextPais)

        btnPesquisa.setOnClickListener{
            val paisValor = pais.text.toString()
            val i = Intent(this, PaisesActivity::class.java)

            val alertDialog: AlertDialog
            val builder = AlertDialog.Builder(this)

            if (paisValor == ""){
                builder.setTitle("Erro")
                builder.setMessage("Digite o Nome do País Corretamente")
                alertDialog = builder.create()
                alertDialog.show()
            }
            else if(paisValor !in ListaPaises){
                builder.setTitle("Erro")
                builder.setMessage("O país não foi encontrado, tente pesquisar por outra nação")
                alertDialog = builder.create()
                alertDialog.show()
            }
            else{
                finish()
                startActivity(i)
            }
        }
    }
}