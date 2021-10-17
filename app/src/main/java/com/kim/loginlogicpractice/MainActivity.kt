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

        val email = EmailTxt.text.toString()
        val password = PasswordTxt.text.toString()

        if(email ="admin@test.com" && password="qwer"){
            Toast.makeText(this, "관리자입니다", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()

    }
}