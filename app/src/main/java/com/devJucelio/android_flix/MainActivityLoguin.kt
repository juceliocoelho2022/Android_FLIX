package com.devJucelio.android_flix

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivityLoguin : AppCompatActivity() {

    private lateinit var btnEntrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_loguin)

        btnEntrar = findViewById(R.id.btn_entrar)

        btnEntrar.setOnClickListener {

            val entrarTelaPerfil = Intent(this, MainActivityPerfil::class.java)

            startActivity(entrarTelaPerfil)

        }
    }
}