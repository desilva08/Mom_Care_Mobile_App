package com.example.momscare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OverWeight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_over_weight)

    val bmiResultTextView = findViewById<TextView>(R.id.bmi_result)
    val bmiValue = intent.getDoubleExtra("bmi", 0.0)
    bmiResultTextView.text = "Your BMI is: $bmiValue"
}
}