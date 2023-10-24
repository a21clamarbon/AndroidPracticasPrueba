package com.example.prueba2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Activitat_12 : AppCompatActivity() {

    private lateinit var enviarButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitat12)

        enviarButton = findViewById(R.id.enviarButton)
        enviarButton.setOnClickListener { showToast("T'has registrat correctament") }
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun showToast(view: View) {}


    }
}