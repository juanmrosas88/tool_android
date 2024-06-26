package com.juanrosasdev.toolandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BotonesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones)

        // Definir los btn de activity_botones por id
        val btnToast = findViewById<Button>(R.id.btnToast)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)

        // Configurando los botones para los mensajes toast
        btnToast.setOnClickListener {
            Toast.makeText(this, "Hola Mundo", Toast.LENGTH_LONG).show()
        }

        button3.setOnClickListener {
            Toast.makeText(this, "Gracias", Toast.LENGTH_SHORT).show()
        }

        val button = findViewById<Button>(R.id.sig_button)


        button.setOnClickListener {
            val intent = Intent(this, ImagenesActivity::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {
            // Acción para el botón de Siguiente
            val intent = Intent(this, ImagenesActivity::class.java)
            startActivity(intent)  // Inicia una nueva actividad
        }
    }
}