package com.hassaan.i230536_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.callpage)

        // When user clicks call_bar → go back to ChatScreenActivity
        val callBar: ImageView = findViewById(R.id.call_bar)
        callBar.setOnClickListener {
            val intent = Intent(this, ChatScreenActivity::class.java)
            startActivity(intent)
            finish() // optional: close CallActivity so user cannot return with back button
        }
    }
}
