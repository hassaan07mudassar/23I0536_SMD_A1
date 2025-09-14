package com.hassaan.i230536_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editprofilepage)

        val cancelText: TextView = findViewById(R.id.cancel_text)
        val doneText: TextView = findViewById(R.id.done_text)

        // Cancel → back to ProfileActivity
        cancelText.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Done → back to ProfileActivity
        doneText.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
