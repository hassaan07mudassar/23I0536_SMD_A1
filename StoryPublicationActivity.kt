package com.hassaan.i230536_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class StoryPublicationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addingstorypage)

        val nextButton: ImageView = findViewById(R.id.send_arrow_button)

        // Navigate to StoryDetailsActivity when "next" icon is clicked
        nextButton.setOnClickListener {
            val intent = Intent(this, StoryDetailsActivity::class.java)
            startActivity(intent)
        }
    }
}
