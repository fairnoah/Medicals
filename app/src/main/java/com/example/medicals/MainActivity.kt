package com.example.medicals

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val splashContinueBtn: Button = findViewById(R.id.splashContinueBtn)


        splashContinueBtn.setOnClickListener {
            // Create an Intent to navigate to GenderActivity
            val statusIntent = Intent(this, SignUpScreen::class.java)
            startActivity(statusIntent)
        }
    }
}