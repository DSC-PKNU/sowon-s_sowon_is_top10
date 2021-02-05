package com.example.wishwish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val question: Button = findViewById(R.id.question_button)
        val write: Button = findViewById(R.id.write_button)
        val list: Button = findViewById(R.id.list_button)
        val maintree : ImageView = findViewById(R.id.main_tree)

        question.setOnClickListener {
            val intent = Intent(this, ExplainActivity::class.java)
            startActivity(intent)
        }

        write.setOnClickListener {
            val intent = Intent(this, DiaryActivity::class.java)
            startActivity(intent)
        }

        list.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

        maintree.setOnClickListener {
            val intent = Intent(this, HappyActivity::class.java)
            startActivity(intent)
        }
    }
}