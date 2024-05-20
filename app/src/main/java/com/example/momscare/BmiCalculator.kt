package com.example.momscare



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat.startActivity


class BmiCalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)

    val heightEditText = findViewById<EditText>(R.id.height_edit_text)
    val weightEditText = findViewById<EditText>(R.id.weight_edit_text)
    val calculateButton = findViewById<Button>(R.id.calculate_button)

    calculateButton.setOnClickListener {
        val heightStr = heightEditText.text.toString()
        val weightStr = weightEditText.text.toString()
        if (heightStr.isNotEmpty() && weightStr.isNotEmpty()) {
            val height = heightStr.toFloat() / 100 // Convert to meters
            val weight = weightStr.toFloat()
            val bmi = weight / (height * height)
            when {
                bmi < 18.5 -> navigateToActivity(UnderWeight::class.java, bmi.toDouble())
                bmi < 24.9 -> navigateToActivity(Normal::class.java, bmi.toDouble())
                bmi < 29.9 -> navigateToActivity(OverWeight::class.java, bmi.toDouble())
                else -> navigateToActivity(Obese::class.java, bmi.toDouble())
            }
        }
    }
}
private fun navigateToActivity(activityClass: Class<*>, bmi: Double) {
    val intent = Intent(this, activityClass)
    intent.putExtra("bmi", bmi)
    startActivity(intent)
}
}
