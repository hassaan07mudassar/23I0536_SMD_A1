package com.hassaan.i230536_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout // Import LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SearchPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.searchpage2)

        // Find the "Clear" TextView by its ID
        val clearTextView: TextView = findViewById(R.id.text_clear)

        // Set a click listener to the "Clear" TextView
        clearTextView.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        // Add this code to make the profile clickable
        val firstProfileLayout: LinearLayout = findViewById(R.id.firstProfileLayout)

        firstProfileLayout.setOnClickListener {
            // Create an Intent to navigate to CelebrityActivity
            val intent = Intent(this, CelebrityActivity::class.java)
            startActivity(intent)
        }
    }
}