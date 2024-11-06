package com.example.doblelayaout

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.vista2)

        val textoRes = findViewById<AppCompatTextView>(R.id.textoFinal)

        val nombre = intent.extras?.getString("EXTRA_NAME").orEmpty()

        textoRes.text = "Hola $nombre"

        val btnColor = findViewById<Button>(R.id.btnColor)

    }
}