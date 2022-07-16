package com.example.restapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener{
    private lateinit var edtHeight: EditText
    private lateinit var edtLength: EditText
    private lateinit var edtWidth: EditText
    private lateinit var btnCalculate: Button
    private lateinit var textResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtHeight = findViewById(R.id.edt_height)
        edtLength = findViewById(R.id.edt_length)
        edtWidth = findViewById(R.id.edt_width)
        btnCalculate = findViewById(R.id.btn_calculate)
        textResult = findViewById(R.id.tv_hasil)

        btnCalculate.setOnClickListener(this)

    }

    override fun onClick(v : View) {
        if (v.id == R.id.btn_calculate) {
            val inputLength = edtLength.text.toString().trim()
            val inputWidth = edtWidth.text.toString().trim()
            val inputHeight = edtHeight.text.toString().trim()

            val volume = inputLength.toDouble() * inputWidth.toDouble() * inputHeight.toDouble()
            textResult.text = volume.toString()
        }
    }


}