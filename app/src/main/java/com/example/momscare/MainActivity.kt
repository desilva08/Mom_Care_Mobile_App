package com.example.momscare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val BmiCalculator = Intent(this, BmiCalculator::class.java)
            startActivity(BmiCalculator)
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val emergencyCallIntent = Intent(this, EmergencyCall::class.java)
            startActivity(emergencyCallIntent)
        }
    }
}