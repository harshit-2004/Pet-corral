package com.example.pet_corral

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    private val splashScreen= 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val logoAnim: Animation = AnimationUtils.loadAnimation(this,R.anim.logo_anim)
        val appLogo: ImageView = findViewById(R.id.imageView)

        appLogo.animation = logoAnim

        Handler().postDelayed({
            startActivity(intent)
            val intent = Intent(this@SplashScreen,Instruction::class.java)
            startActivity(intent)
            finish()
        },splashScreen.toLong())
    }
}