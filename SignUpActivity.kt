package com.hassaan.i230536_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signuppage)

        val createAccountButton: Button = findViewById(R.id.create_account_button)

        // Set up the click listener for the "Create an Account" button
        createAccountButton.setOnClickListener {
            // Navigate to the main user page after account creation
            val intent = Intent(this, LoginUserActivity::class.java)
            startActivity(intent)
        }
    }
}