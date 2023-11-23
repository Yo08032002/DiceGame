package com.example.dicegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Coin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin)

        val tossButton: Button = findViewById(R.id.button)
        tossButton.setOnClickListener { tossCoin() }

        // Do a dice roll when the app starts
        tossCoin()
    }
    private fun tossCoin(){
        val x=toss()

        val coinImage: ImageView =findViewById(R.id.imageView)

        val ct=when(x){
            0->R.drawable.coin0
            else->R.drawable.coin1
        }

        coinImage.setImageResource(ct)
    }
}


//class Game{
//    fun roll():Int{
//        return (1..6).random()
//    }
//
//    fun Toss():Int{
//        return(0..1).random()
//    }
//}
fun toss():Int{
    return(0..1).random()
}