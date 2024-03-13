package com.hernanrinaldi.hernan_rinaldi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val buttonBackMenu = findViewById<Button>(R.id.BtnBackMenu)
        buttonBackMenu.setOnClickListener { navigateToMenu() }

    }
    private fun navigateToMenu(){
        val intentNavigateBack = Intent(this, MenuActivity::class.java)
        startActivity(intentNavigateBack)
    }

}