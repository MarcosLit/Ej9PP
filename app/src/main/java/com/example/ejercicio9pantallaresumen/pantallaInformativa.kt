package com.example.ejercicio9pantallaresumen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class pantallaInformativa : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_informativa)
        var tvClase = findViewById<TextView>(R.id.tvClase)
        tvClase.text =intent.getStringExtra("nombreClase").toString()

        var tvRaza = findViewById<TextView>(R.id.tcRaza)
        tvRaza.text=intent.getStringExtra("nombreRaza").toString()

        var imagenClase=findViewById<ImageView>(R.id.imagenClase)
        if (tvClase.text.toString()=="Mago")
            imagenClase.setImageResource(R.drawable.mago)
        else if (tvClase.text.toString()=="Guerrero")
            imagenClase.setImageResource(R.drawable.guerrero)
        else if (tvClase.text.toString()=="Ladron")
            imagenClase.setImageResource(R.drawable.ladron)
        else if (tvClase.text.toString()=="Berserker")
            imagenClase.setImageResource(R.drawable.berserker)

        var imagenRaza=findViewById<ImageView>(R.id.imagenRaza)
        if (tvRaza.text.toString()=="Elfo")
            imagenRaza.setImageResource(R.drawable.elfo)
        else if (tvRaza.text.toString()=="Enano")
            imagenRaza.setImageResource(R.drawable.enano)
        else if (tvRaza.text.toString()=="Humano")
            imagenRaza.setImageResource(R.drawable.humano)
        else if (tvRaza.text.toString()=="Goblin")
            imagenRaza.setImageResource(R.drawable.goblin)

        var fuerza = findViewById<TextView>(R.id.fuerzaInt)
        var numeros = 10..15
        var defensa = findViewById<TextView>(R.id.defensaInt)
        fuerza.text = numeros.random().toString()
        numeros = 1..5
        defensa.text = numeros.random().toString()

        var volver = findViewById<Button>(R.id.volver)
        volver.setOnClickListener(){
            var intent= Intent(this, chooseClase::class.java)
            startActivity(intent)
        }

        var continuar = findViewById<Button>(R.id.continuar)
        continuar.setOnClickListener(){
            var intent= Intent(this, AcitvityVacia::class.java)
            startActivity(intent)
        }
    }
}