package com.example.t3a3jonathanpieratorregrosa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.widget.EditText

// NO SE HACER EL BINDING, NO LO ENTIENDO Y NI IDEA //


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.tv2)
        val button = findViewById<Button>(R.id.button1)

        button.setOnClickListener {

            val texto = editText.text.toString()

            val intent = Intent(this, VistaLogin::class.java)

            intent.putExtra("TEXTO", texto)

            startActivity(intent)

        }
    }
}
