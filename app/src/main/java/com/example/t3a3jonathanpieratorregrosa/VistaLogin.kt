package com.example.t3a3jonathanpieratorregrosa

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class VistaLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista_login)

        val textView = findViewById<TextView>(R.id.textView1)

        val textoRecibido = ("Bienvenid@ " + intent.getStringExtra("TEXTO"))

        textView.text = textoRecibido
    }
}
