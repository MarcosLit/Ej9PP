package com.example.ejercicio9pantallaresumen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class chooseClase : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imagen = findViewById<ImageView>(R.id.imageClaseClase)
        var comenzar = findViewById<Button>(R.id.button)
        var mago = findViewById<Button>(R.id.mago)
        var ladron = findViewById<Button>(R.id.ladron)
        var guerrero = findViewById<Button>(R.id.gurrero)
        var berserker = findViewById<Button>(R.id.berserker)


        var nombreClase=""


        mago.setOnClickListener(){
                imagen.setImageResource(R.drawable.mago)
                nombreClase=mago.text.toString()
        }

        ladron.setOnClickListener(){
            imagen.setImageResource(R.drawable.ladron)
            nombreClase=ladron.text.toString()
        }

        guerrero.setOnClickListener(){
            imagen.setImageResource(R.drawable.guerrero)
            nombreClase=guerrero.text.toString()
        }

        berserker.setOnClickListener(){
            imagen.setImageResource(R.drawable.berserker)
            nombreClase=berserker.text.toString()
        }




        comenzar.setOnClickListener(){
            var intent= Intent(this, chooseRaza::class.java)
            intent.putExtra("nombreClase", nombreClase)
            startActivity(intent)
        }
    }
}