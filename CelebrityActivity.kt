package com.hassaan.i230536_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class CelebrityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.celebrityaccountpage)

        val backArrow: ImageView = findViewById(R.id.back_arrow)
        backArrow.setOnClickListener { finish() }


    }
}