package com.example.vatapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vatapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // binding object
    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root //reference layout file
        setContentView(view) // link layout

        binding.btnCalculateVat.setOnClickListener {
            calculateVat()
        } //End setOnClickListener
    } // End onCreate

    private fun calculateVat() {
        TODO("Not yat implemented")
    }
} // End MainActivity


