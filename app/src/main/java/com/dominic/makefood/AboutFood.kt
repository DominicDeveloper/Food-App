package com.dominic.makefood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dominic.makefood.Cache.MyShared

import kotlinx.android.synthetic.main.activity_about_food.*
import kotlinx.android.synthetic.main.item_ru.*
import kotlinx.android.synthetic.main.item_ru.txt_name

class AboutFood : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_food)
        supportActionBar?.hide()

        MyShared.init(this)
        val list = MyShared.objectString

        val position = intent.getIntExtra("position",0)
        txt_name.text = list[position].name
        txt_recourse.text = list[position].ingredient
        txt_make_food.text = list[position].makeFood
    }
}