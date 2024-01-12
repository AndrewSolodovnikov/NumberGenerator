package com.sol.numbergenerator

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.sol.numbergenerator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(View.OnClickListener {
            var minValue = binding.editTextMin.text.toString().toInt()
            var maxValue = binding.editTextMax.text.toString().toInt()
            if (minValue > maxValue) {
                Toast.makeText(this, "The numbers are entered incorrectly", Toast.LENGTH_SHORT).show()
            } else {
                var randomNumber = (minValue..maxValue).random()
                binding.textView.text = randomNumber.toString()
            }
        })
    }
}