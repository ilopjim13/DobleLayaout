package com.example.doblelayaout

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        val btnColor = findViewById<Button>(R.id.btnColor)


        btnEnviar.setOnClickListener {
            Log.i("Etiqueta", "Hola")
            val textoEdit = findViewById<EditText>(R.id.textoEdit)
            val textito = textoEdit.text.toString()

            if (textito.isNotBlank()) {
                val intento = Intent(this, MainActivity2::class.java)
                intento.putExtra("EXTRA_NAME", textito)
                startActivity(intento)
            }
        }

        btnColor.setOnClickListener {
            val randomColor = Color.rgb(Random.nextInt(256),Random.nextInt(256), Random.nextInt(256))
            val main = findViewById<ConstraintLayout>(R.id.main)
            main.setBackgroundColor(randomColor)
        }
    }
}