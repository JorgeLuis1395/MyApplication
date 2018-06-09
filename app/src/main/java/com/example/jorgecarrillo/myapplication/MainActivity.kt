package com.example.jorgecarrillo.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.kittinunf.fuel.httpGet
import kotlinx.android.synthetic.main.activity_main.*
import com.github.kittinunf.result.Result

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonhttp.setOnClickListener { view -> irActividadHTTP() }

    }
    fun irActividadHTTP () {
        var intent = Intent (this, HttpFuelActivity::class.java)
        startActivity(intent)
    }
}
