package com.example.prueba2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activitat_8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitat8)
        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<Button>(R.id.editText)
        val textView = findViewById<Button>(R.id.textView)

        button.setOnClickListener {

            val userInput = editText.text.toString()

            textView.text = "El que has enviat és: $userInput"
        }
    }
}
