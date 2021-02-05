package com.example.wishwish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HappyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_happy)

        val imagebutton : ImageView = findViewById(R.id.imageView)
        val appleimage : ImageView = findViewById(R.id.apple_image)

        imagebutton.setOnClickListener{
            val intent = Intent(this, BlueActivity::class.java)
            startActivity(intent)
        }

        appleimage.setOnClickListener{
            val intent = Intent(this, HappyResultActivity::class.java)
            startActivity(intent)
        }
    }
}