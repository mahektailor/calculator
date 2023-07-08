package com.example.calculator

import  android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var inputEditText: EditText
    private lateinit var outputTextView: TextView
    private lateinit var conversionSpinner: Spinner
    private lateinit var convertButton: Button
// added array for spinner to selected by user
    private val conversionOptions = arrayOf(
        "cm to in",
        "in to cm",
        "km to m",
        "m to km",
        "ml to L",
        "L to ml"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}