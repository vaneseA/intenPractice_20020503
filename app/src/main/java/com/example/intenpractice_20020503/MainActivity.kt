package com.example.intenpractice_20020503

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_NAME = 1001
    val REQ_FOR_NICKNAME = 1003
    val REQ_FOR_PHONENUM = 1003


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  myIntent = Intent(this, SecondActivity::class.java)

        editNameBtn.setOnClickListener { startActivityForResult(myIntent,REQ_FOR_NAME) }
    }
}