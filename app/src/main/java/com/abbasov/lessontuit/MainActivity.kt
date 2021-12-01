package com.abbasov.lessontuit

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        txt_next.setOnClickListener {
            val name=edt_name.text.toString()
            val number=edt_number.text.toString()
            val korobka = User(name,number)
            val intent = Intent(this, Edit::class.java)
            intent.putExtra("en", "$korobka") //second param is Serializable
            startActivity(intent)


        }

    }
}