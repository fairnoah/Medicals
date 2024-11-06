package com.example.medicals

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_screen)

        val signupText = findViewById<TextView>(R.id.loginSignUp)



        signupText.setOnClickListener {
            // Create an Intent to navigate to GenderActivity
            val statusIntent = Intent(this, SignUpScreen::class.java)
            startActivity(statusIntent)
        }
    }
}