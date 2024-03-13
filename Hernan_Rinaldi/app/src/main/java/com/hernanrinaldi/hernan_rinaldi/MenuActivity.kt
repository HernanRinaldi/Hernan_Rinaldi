package com.hernanrinaldi.hernan_rinaldi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val buttonAbout = findViewById<Button>(R.id.About)
        val buttonSkills = findViewById<Button>(R.id.Skills)
        val buttonProjects = findViewById<Button>(R.id.Projects)
        val buttonContact = findViewById<Button>(R.id.Contact)

        buttonAbout.setOnClickListener { navigateToAbout() }
        buttonSkills.setOnClickListener { navigateToSkills() }
        buttonProjects.setOnClickListener { navigateToProjects() }
        buttonContact.setOnClickListener { navigateToContact() }
    }
     private fun navigateToAbout (){
        val intentAbout = Intent(this, AboutActivity::class.java)
        startActivity(intentAbout)
    }
     private fun navigateToSkills (){
         val intentSkills = Intent(this, SkillsActivity::class.java)
     startActivity(intentSkills)
     }
    private fun navigateToProjects (){
        val intentProjects = Intent(this, ProjectsActivity::class.java)
        startActivity(intentProjects)
    }
    private fun navigateToContact (){
        val intentContact = Intent(this, ContactActivity::class.java)
        startActivity(intentContact)
    }

}