package com.example.birthdaywishapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    // For getting the value of variable
    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        // For getting the value of input text
        val name = intent.getStringExtra(NAME_EXTRA)

        // Find the TextView by its ID
        val birthdayGreeting = findViewById<TextView>(R.id.birthdayGreeting)

        // Replace the value to the TextView
        birthdayGreeting.text = "Happy Birthday $name"
    }
}