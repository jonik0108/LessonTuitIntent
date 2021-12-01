package com.abbasov.lessontuit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit.*


class Edit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)


        val intent = intent
        val fName = intent.getStringExtra("en")

        Toast.makeText(this, "$fName", Toast.LENGTH_SHORT).show()
        txttt.text=fName



    }
}