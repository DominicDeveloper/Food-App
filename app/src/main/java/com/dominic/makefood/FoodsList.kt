package com.dominic.makefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Toast
import com.dominic.makefood.Adapter.MyAdapter
import com.dominic.makefood.Cache.MyShared
import kotlinx.android.synthetic.main.activity_foods_list.*

class FoodsList : AppCompatActivity() {
    lateinit var myAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foods_list)
        title = "Barcha taomlar"


        MyShared.init(this)
        val list = MyShared.objectString
        myAdapter = MyAdapter(this,list)

        list_food.adapter = myAdapter

        list_food.setOnItemClickListener { parent, view, position, id ->

            val intent = Intent(this,AboutFood::class.java)
            intent.putExtra("position",position)
            startActivity(intent)

        }


    }
}