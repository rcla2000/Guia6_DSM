package com.example.myapplicationpractica06_dsm104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RelativeLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)
    }

    fun finalizar(view: View?) {
        finish()
    }
}