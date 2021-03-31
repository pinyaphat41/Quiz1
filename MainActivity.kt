//Import necessary package and file
package com.magnetbrains

import android.R
import android.app.Activity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.TextView

//Main activity class start here
class MainActivity : Activity() {
    //Define layout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Get the references to the widgets
        val e1 = findViewById<View>(R.id.et1) as EditText
        val e2 = findViewById<View>(R.id.et2) as EditText
        val tv4 = findViewById<View>(R.id.tv4) as TextView
        findViewById<View>(R.id.ib1).setOnClickListener(
            View.OnClickListener
            // Logic for validation, input can't be empty
            {
                val str1 = e1.text.toString()
                val str2 = e2.text.toString()
                if (TextUtils.isEmpty(str1)) {
                    e1.error = "Please enter your weight"
                    e1.requestFocus()
                    return@OnClickListener
                }
                if (TextUtils.isEmpty(str2)) {
                    e2.error = "Please enter your height"
                    e2.requestFocus()
                    return@OnClickListener
                }

                //Get the user values from the widget reference
                val weight = str1.toFloat()
                val height = str2.toFloat() / 100

                //Calculate BMI value
                val bmiValue = calculateBMI(weight, height)

                //Define the meaning of the bmi value
                val bmiInterpretation = interpretBMI(bmiValue)
                tv4.text = "$bmiValue-$bmiInterpretation"
            })
    }

    //Calculate BMI
    private fun calculateBMI(weight: Float, height: Float): Float {
        return (weight / (height * height))
    }

    // Interpret what BMI means
    private fun interpretBMI(bmiValue: Float): String {
        return if (bmiValue < 16) {
            "Severely underweight"
        } else if (bmiValue < 18.5) {
            "Underweight"
        } else if (bmiValue < 25) {
            "Normal"
        } else if (bmiValue < 30) {
            "Overweight"
        } else {
            "Obese"
        }
    }
}