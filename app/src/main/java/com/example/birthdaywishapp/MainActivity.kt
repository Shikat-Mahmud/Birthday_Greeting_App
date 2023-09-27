package com.example.birthdaywishapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CreateBirthdayCard(view: View) {
        // Find the EditText by its ID
        val nameInput = findViewById<EditText>(R.id.nameInput)

        // Get the text from the EditText and store it in the 'name' variable
        val name = nameInput.text.toString()

        // Now you can use the 'name' variable as needed
//        Toast.makeText(this, "Happy Birthday $name", Toast.LENGTH_LONG).show()

        // using Intent for going to new Activity
        val intent = Intent(this, BirthdayGreetingActivity::class.java)

        // for parsing the name value | NAME_EXTRA is the const variable of 2nd Activity
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)

        // for starting the new Activity
        startActivity(intent)
    }

}