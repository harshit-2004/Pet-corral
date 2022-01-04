package com.example.pet_corral

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class HomeActivity : AppCompatActivity()
      {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this,buyOrSell::class.java)
            startActivity(intent)
        }


    }
}




