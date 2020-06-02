package com.cfsuman.kotlinexamples

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_view)
        val button = findViewById<Button>(R.id.button);

        var counter: Int = 0;

        button.setOnClickListener {
            counter++
            textView.text = "Click counter : $counter"
        }
    }
}