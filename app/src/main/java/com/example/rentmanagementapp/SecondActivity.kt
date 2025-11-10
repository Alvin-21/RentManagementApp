package com.example.rentmanagementapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.second_activity)

        val outputNameTextView = findViewById<TextView>(R.id.textView)
        val outputRentTextView = findViewById<TextView>(R.id.textView2)
        val receiveFirstName = intent.getStringExtra("FIRST_NAME")
        val receiveSecondName = intent.getStringExtra("SECOND_NAME")
        val receiveRentAmount = intent.getStringExtra("RENT_AMOUNT")

        outputNameTextView.text = "Tenant Name: $receiveFirstName $receiveSecondName"
        outputRentTextView.text = "Rent: $receiveRentAmount"
    }
}