package com.example.wish_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class BlueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blue)

        val Caterpillars_image : ImageView = findViewById(R.id.Caterpillars)

        Caterpillars_image.setOnClickListener{
            val intent = Intent(this, MissionPageFragment::class.java)
            startActivity(intent)
        }
    }
}