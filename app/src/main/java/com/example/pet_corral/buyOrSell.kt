package com.example.pet_corral

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class buyOrSell : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_or_sell)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this,PetName::class.java)
            startActivity(intent)
        }
    }
}