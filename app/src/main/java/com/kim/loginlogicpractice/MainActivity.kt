package com.kim.loginlogicpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

logBtn.setOnClickListener { 
    val Id = idEdt.text.toString()
    val Pw = psEdt.text.toString()

    if( Id == "daeding7" && Pw =="jomy486"){
//  관리자 이름 변수로 지정
    val name = "김준휘 바봅"

        Toast.makeText(this, "${name}관리자입니다", Toast.LENGTH_SHORT).show()
    }
    else{

        Toast.makeText(this, "잘못된 정보입니다", Toast.LENGTH_SHORT).show()
    }
}

    }
    }