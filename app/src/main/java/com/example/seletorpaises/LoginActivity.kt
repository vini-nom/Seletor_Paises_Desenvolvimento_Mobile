package com.example.seletorpaises

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val i = Intent(this, MainActivity::class.java)

        var btnLogin = findViewById<Button>(R.id.btnLogin)
        var nomeText = findViewById<EditText>(R.id.editTextNome)
        var senhaText = findViewById<EditText>(R.id.editTextSenha)


        btnLogin.setOnClickListener{
            var valorSenha = senhaText.text.toString()
            var valorNome = nomeText.text.toString()

            var alertDialogView: AlertDialog
            val builder = AlertDialog.Builder(this)

            if(valorNome == ""){
                builder.setTitle("Erro")
                builder.setMessage("Preencha o nome corretamente")
                alertDialogView = builder.create()
                alertDialogView.show()
            }
            else if(valorSenha == ""){
                builder.setTitle("Erro")
                builder.setMessage("Preencha a senha corretamente")
                alertDialogView = builder.create()
                alertDialogView.show()
            }
            /*else if(valorSenha == "" && valorNome == ""){
                builder.setTitle("Erro")
                builder.setMessage("Preencha todos os campos corretamente")
                alertDialogView = builder.create()
                alertDialogView.show()
            }*/
            else {
                finish()
                startActivity(i)
            }
        }
    }
}