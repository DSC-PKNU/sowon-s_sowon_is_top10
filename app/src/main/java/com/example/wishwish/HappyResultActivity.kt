package com.example.wishwish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class HappyResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_happy_result)

        val text = arrayOf("한 번 실패와 \n영원한 실패를 혼동하지 마라",
            "문제점을 찾지 말고\n해결책을 찾으라",
            "최고에 도달하려면\n최저에서 시작하라",
            "인생을 다시 산다면 \n다음번에는\n더 많은 실수를 저지르리라",
            "행복은 습관이다,\n그것을 몸에 지니라")

        val random = Random()
        val num = random.nextInt(5)

        val tvtext : TextView = findViewById(R.id.tv_text)
        val textbutton : Button = findViewById(R.id.text_button)
        textbutton.setOnClickListener{
            tvtext.text = text[num]
        }
    }
}