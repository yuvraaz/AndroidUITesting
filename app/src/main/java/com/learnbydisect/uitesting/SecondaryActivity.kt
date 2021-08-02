package com.learnbydisect.uitesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondaryActivity : AppCompatActivity() {

    lateinit var backButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        backButton = findViewById(R.id.button_back)
        backButton.setOnClickListener {
            onBackPressed()
        }


    }
}