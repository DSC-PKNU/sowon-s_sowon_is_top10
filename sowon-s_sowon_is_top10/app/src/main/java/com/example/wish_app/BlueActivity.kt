package com.example.wish_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment

class BlueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blue)

        val Caterpillars_image : ImageView = findViewById(R.id.Caterpillars)

        fun changeFragment(f: Fragment, cleanStack: Boolean = false) {
            val ft = supportFragmentManager.beginTransaction() // (2) 프래그먼트 관리자를 통한 제어
            ft.replace(R.id.content, f) // (3) 프래그먼트의 변경
            ft.addToBackStack(null) // (4) 백스택에 넣기
            ft.commit() // (5) 최종 프래그먼트의 적용
        }

        Caterpillars_image.setOnClickListener{
            //val intent = Intent(this, MissionPageFragment::class.java)
            //startActivity(intent)
            changeFragment(MissionPageFragment())
        }
    }
}