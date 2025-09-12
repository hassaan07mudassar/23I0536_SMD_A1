package com.hassaan.i230536_assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)

        // The correct way to launch the LoginActivity
        val intent = Intent(this, LoginActivity::class.java)

        lifecycleScope.launch {
            delay(1500)
            startActivity(intent)
            finish()
        }
    }
}