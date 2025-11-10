package com.example.rentmanagementapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.rentmanagementapp.ui.theme.RentManagementAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val firstNameInput = findViewById<EditText>(R.id.firstName)
        val secondNameInput = findViewById<EditText>(R.id.secondName)
        val rentAmountInput = findViewById<EditText>(R.id.rentAmount)
        val displayRentButton = findViewById<Button>(R.id.displayRent)

        displayRentButton.setOnClickListener {
            val firstName = firstNameInput.text.toString()
            val secondName = secondNameInput.text.toString()
            val rentAmount = rentAmountInput.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("FIRST_NAME", firstName)
            intent.putExtra("SECOND_NAME", secondName)
            intent.putExtra("RENT_AMOUNT", rentAmount)
            startActivity(intent)
        }
    }
}