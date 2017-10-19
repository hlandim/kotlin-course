package com.example.hugolandimsantos.ktempconverter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_convert.setOnClickListener { convert() }
    }

    fun convert() {
        var temp: Double = edt_temp.text.toString().toDouble()

        if (ck_celsius.isChecked) {
            temp = (temp - 32) * 5 / 9
        } else if (ck_fahrenheit.isChecked) {
            temp = temp * 9 / 5 + 32
        }

        edt_temp.setText(temp.toString())
    }
}
