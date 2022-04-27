package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val primeiro = findViewById<EditText>(R.id.editTextNumber1)
        val segundo = findViewById<EditText>(R.id.editTextNumber2)
        val botao = findViewById<Button>(R.id.button)

        botao.setOnClickListener {

            val primeiroInt = Integer.parseInt( primeiro.text.toString())
            val segundoInt = Integer.parseInt( segundo.text.toString())

            when {

                primeiroInt > segundoInt -> {
                    val toast = Toast.makeText(applicationContext, "Campo 1 é maior que o Campo 2", Toast.LENGTH_SHORT)
                    toast.show()
                }

                primeiroInt < segundoInt -> {
                    val toast = Toast.makeText(applicationContext, "Campo 2 é maior que o Campo 1", Toast.LENGTH_SHORT)
                    toast.show()
                }

                else -> {
                    val toast = Toast.makeText(applicationContext, "Campo 1 é igual ao Campo 2", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }

    }
}
