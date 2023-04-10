package com.fcascan.myapplication

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnBlue : Button
    lateinit var btnRed : Button
    lateinit var btnShow : Button
    lateinit var btnHide : Button
    lateinit var txtHello : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBlue = findViewById(R.id.btnBlue)
        btnRed = findViewById(R.id.btnRed)
        btnShow = findViewById(R.id.btnShow)
        btnHide = findViewById(R.id.btnHide)
        txtHello = findViewById(R.id.txtHello)

        btnBlue.setOnClickListener(){
            txtHello.setTextColor(Color.BLUE)
        }
        btnRed.setOnClickListener(){
            txtHello.setTextColor(Color.RED)
        }
        btnShow.setOnClickListener(){
            txtHello.visibility = View.VISIBLE
        }
        btnHide.setOnClickListener(){
            txtHello.visibility = View.INVISIBLE
        }

    }
}