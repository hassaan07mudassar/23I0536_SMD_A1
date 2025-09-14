package com.hassaan.i230536_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class StoryDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.storydetails)

        val bottomToolbar: ImageView = findViewById(R.id.bottom_navigation_bar)

        // On click → move to StoryDetails2Activity
        bottomToolbar.setOnClickListener {
            val intent = Intent(this, StoryDetails2Activity::class.java)
            startActivity(intent)
        }
    }
}
