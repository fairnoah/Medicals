package com.example.medicals

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SignUpScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up_screen)

        val loginText = findViewById<TextView>(R.id.loginSignUp)



        loginText.setOnClickListener {
            // Create an Intent to navigate to GenderActivity
            val statusIntent = Intent(this, LoginScreen::class.java)
            startActivity(statusIntent)
        }
    }
}