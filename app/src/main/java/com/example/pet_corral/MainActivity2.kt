package com.example.pet_corral

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mauth= FirebaseAuth.getInstance()
        val button: Button =findViewById(R.id.button)
        button.setOnClickListener {
            mauth.signOut()
            val intent= Intent(this,LogIn::class.java)
            startActivity(intent)
            finish()
        }


    }
}