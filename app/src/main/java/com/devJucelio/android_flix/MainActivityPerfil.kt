package com.devJucelio.android_flix

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivityPerfil : AppCompatActivity() {

    private lateinit var btnDetalhesSidnei: ImageView
    private lateinit var btnDetalhesHeitor: ImageView
    private lateinit var btnDetalhesSocorro: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_perfil)

        btnDetalhesSidnei = findViewById(R.id.imgPerfilSidnei)
        btnDetalhesHeitor = findViewById(R.id.imgPerfilHeitor)
        btnDetalhesSocorro = findViewById(R.id.imgPerfilSocorro)

        val intent = Intent(this, MainActivityDetalhes::class.java)

        btnDetalhesSidnei.setOnClickListener {
            startActivity(intent)
        }

        btnDetalhesHeitor.setOnClickListener {
            startActivity(intent)
        }
        btnDetalhesSocorro.setOnClickListener{
            startActivity(intent)
        }
    }
}
