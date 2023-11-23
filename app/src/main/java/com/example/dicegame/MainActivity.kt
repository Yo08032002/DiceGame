package com.example.dicegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button=findViewById(R.id.button1)
        rollButton.setOnClickListener {
            val intent=Intent(this,Dice::class.java)
            startActivity(intent)
        }

        val tossButton:Button=findViewById(R.id.button2)
        tossButton.setOnClickListener {
            val intent=Intent(this,Coin::class.java)
            startActivity(intent)
        }
    }





}



