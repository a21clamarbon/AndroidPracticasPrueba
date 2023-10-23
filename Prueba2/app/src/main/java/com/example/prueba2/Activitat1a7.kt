package com.example.prueba2
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activitat1a7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Actividad 5: Botón que imprime en Logcat
    fun imprimirEnLogcat(view: View) {
        Log.d("MiApp", "Botón apretado")
    }

    // Actividad 6: Botón que muestra un Toast
    fun mostrarToast(view: View) {
        Toast.makeText(this, "Botón apretado", Toast.LENGTH_SHORT).show()
    }

    // Actividad 7: Validar inicio de sesión
    fun iniciarSesion(view: View) {
        val usernameEditText = findViewById(R.id.usernameEditText)
        val passwordEditText = findViewById(R.id.passwordEditText)

        val usuario = usernameEditText.text.toString()
        val contrasena = passwordEditText.text.toString()

        if (usuario == "usuario" && contrasena == "contrasena") {
            Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Inicio de sesión fallido", Toast.LENGTH_SHORT).show()
        }
    }
}
