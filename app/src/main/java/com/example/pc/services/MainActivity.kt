package com.example.pc.services

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent=Intent(this@MainActivity,MyService::class.java)
        btnPlay.setOnClickListener {
            startService(intent)
        }
        btnPause.setOnClickListener {
            stopService(intent)
        }
    }
}
