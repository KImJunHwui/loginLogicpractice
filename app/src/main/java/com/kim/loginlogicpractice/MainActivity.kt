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
    val inputId = idEdt.text.toString()
    val inputPw = psEdt.text.toString()
    
    if( inputId == "daeding7" && inputPw =="jomy486"){

        Toast.makeText(this, "관리자입니다", Toast.LENGTH_SHORT).show()
    }
    else{

        Toast.makeText(this, "잘못된 정보입니다", Toast.LENGTH_SHORT).show()
    }
}

    }
    }