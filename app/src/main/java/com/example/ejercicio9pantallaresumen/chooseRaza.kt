package com.example.ejercicio9pantallaresumen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class chooseRaza : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_raza)
        var imagen = findViewById<ImageView>(R.id.imageRazaRaza)
        var elfo = findViewById<Button>(R.id.belfo)
        var humano = findViewById<Button>(R.id.bhumano)
        var enano = findViewById<Button>(R.id.benano)
        var goblin = findViewById<Button>(R.id.bgoblin)
        var aceptar = findViewById<Button>(R.id.aceptar)

        var nombreClase=intent.getStringExtra("nombreClase")
        var nombreRaza=""




        elfo.setOnClickListener(){
            imagen.setImageResource(R.drawable.elfo)
            nombreRaza=elfo.text.toString()
        }

        humano.setOnClickListener(){
            imagen.setImageResource(R.drawable.humano)
            nombreRaza=humano.text.toString()
        }

        enano.setOnClickListener(){
            imagen.setImageResource(R.drawable.enano)
            nombreRaza=enano.text.toString()
        }

        goblin.setOnClickListener(){
            imagen.setImageResource(R.drawable.goblin)
            nombreRaza=goblin.text.toString()
        }

        aceptar.setOnClickListener(){
            var intent = Intent(this, pantallaInformativa::class.java)
            intent.putExtra("nombreClase", nombreClase)
            intent.putExtra("nombreRaza", nombreRaza)
            startActivity(intent)
        }
    }
}