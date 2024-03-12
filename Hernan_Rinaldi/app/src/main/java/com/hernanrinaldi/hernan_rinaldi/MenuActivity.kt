package com.hernanrinaldi.hernan_rinaldi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val ButtonAbout = findViewById<Button>(R.id.About)
        val ButtonSkills = findViewById<Button>(R.id.Skills)
        val ButtonProjects = findViewById<Button>(R.id.Projects)
        val ButtonContact = findViewById<Button>(R.id.Contact)

    }
}