package com.example.quiz1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.util.Log

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val protected = null
        fun onCreate(bundle: Bundle?, function: () -> Int) {

        }

        private infix fun Nothing?.void(onCreate: Unit) {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_result);
            Intent intent = getIntent ();
            String message = intent . getStringExtra ("RESULT");
            float bmiValue = intent . getFloatExtra ("BMI", 0);
            float weight = intent . getFloatExtra ("WEIGHT", 0);
            float height = intent . getFloatExtra ("HEIGHT", 0);
            //BMI-IMAGEVIEW
            int resource_id = this.getResources()
            .getIdentifier("drawable/" + message, null, this.getPackageName());
            ImageView imageView =(ImageView) findViewById (R.id.image_result);
            imageView.setImageResource(resource_id);
            //BMI-TEXTVIEW
            TextView textView =(TextView) findViewById (R.id.number);
            textView.setText(String.format("%.1f", bmiValue));
            //LOG
            Log.d("BMI", "" + bmiValue);
            Log.d("WEIGHT", "" + weight);
            Log.d("HEIGHT", "" + height);
        }
        }

    }
}

private fun Nothing?.getResources(): Any {

}
