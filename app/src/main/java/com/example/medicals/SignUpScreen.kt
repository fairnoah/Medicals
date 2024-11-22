package com.example.medicals

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)

        // Retrieve the login text
        val loginText = findViewById<TextView>(R.id.loginSignUp)

        // Retrieve the button and EditText fields
        val signupContinueBtn = findViewById<Button>(R.id.signupContinuBtn) // Continue button
        val emailEditText = findViewById<EditText>(R.id.signupEmailAddress) // Email field
        val fullNameEditText = findViewById<EditText>(R.id.signupFullname) // Full name field
        val phoneNumberEditText = findViewById<EditText>(R.id.signupPhone) // Phone number field

        signupContinueBtn.setOnClickListener {
            // Get the input values
            val email = emailEditText.text.toString().trim()
            val fullName = fullNameEditText.text.toString().trim()
            val phoneNumber = phoneNumberEditText.text.toString().trim()

            // Validate that all fields are filled
            if (email.isEmpty() || fullName.isEmpty() || phoneNumber.isEmpty()) {
                Toast.makeText(this, "Fill in the fields!", Toast.LENGTH_SHORT).show()
            } else {
                // Navigate to LoginScreen if all fields are valid
                val intent = Intent(this, LoginScreen::class.java)
                startActivity(intent)
            }
        }
        // Navigate to LoginScreen when the login text is clicked
        loginText.setOnClickListener {
            val intent = Intent(this, LoginScreen::class.java)
            startActivity(intent)
        }
    }
}