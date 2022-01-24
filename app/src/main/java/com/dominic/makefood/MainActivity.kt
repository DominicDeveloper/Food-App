package com.dominic.makefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       supportActionBar?.hide()

        card_menyu.setOnClickListener {

            clik(card_menyu)
            val intent = Intent(this,FoodsList::class.java)
            startActivity(intent)

        }
        card_add_taom.setOnClickListener {

            clik(card_add_taom)
            val intent = Intent(this,AddFood::class.java)
            startActivity(intent)

        }

    }
    fun clik(card:CardView){
        val anim = AnimationUtils.loadAnimation(this,R.anim.anim_click)
        card.startAnimation(anim)
    }
}