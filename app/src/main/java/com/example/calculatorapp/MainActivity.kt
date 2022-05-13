package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etFirstNumber : EditText
    lateinit var etSecondNumber : EditText
    lateinit var btnAdd : Button
    lateinit var btnSubtract : Button
    lateinit var btnMultiply : Button
    lateinit var btnModulus : Button
    lateinit var tvResult : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFirstNumber = findViewById(R.id.etFirstNumber)
        etSecondNumber = findViewById(R.id.etSecondNumber)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        tvResult = findViewById(R.id.tvResult)



        btnAdd.setOnClickListener {

            var result1 = etFirstNumber.text.toString().toInt()
            var result2 = etSecondNumber.text.toString().toInt()

            addition(result1, result2)
        }

        btnSubtract.setOnClickListener {

            var result1 = etFirstNumber.text.toString().toInt()
            var result2 = etSecondNumber.text.toString().toInt()

            subtraction(result1, result2)
        }

        btnMultiply.setOnClickListener {

            var result1 = etFirstNumber.text.toString().toInt()
            var result2 = etSecondNumber.text.toString().toInt()

            multiplication(result1, result2)
        }

        btnModulus.setOnClickListener {

            var result1 = etFirstNumber.text.toString().toInt()
            var result2 = etSecondNumber.text.toString().toInt()

            modulus(result1, result2)
        }



    }

    fun addition(result1: Int, result2: Int){
        var result = result1 + result2
        tvResult.text = result.toString()
    }

    fun subtraction(result1: Int, result2: Int){
        var result = result1 - result2
        tvResult.text = result.toString()
    }

    fun multiplication(result1: Int, result2: Int){
        var result = result1 * result2
        tvResult.text = result.toString()
    }

    fun modulus(result1: Int, result2: Int){
        var result = result1 % result2
        tvResult.text = result.toString()
    }


}






