package com.dominic.makefood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dominic.makefood.Cache.MyShared
import com.dominic.makefood.Model.Food
import kotlinx.android.synthetic.main.activity_add_food.*

class AddFood : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_food)
        title = "Taom qo`shish"

        MyShared.init(this)

        btn_save.setOnClickListener {
            val name = edt_food_name.text.toString().trim()
            val product = edt_food_recourse.text.toString().trim()
            val proparationoreder = edt_food_makes.text.toString().trim()

            if (name != "" && product != "" && proparationoreder != ""){
                val list = MyShared.objectString
                list.add(Food(name,product,proparationoreder))
                MyShared.objectString = list
                Toast.makeText(this, "Saved!", Toast.LENGTH_SHORT).show()
                finish()
            }else
            {
                Toast.makeText(this, "Ma`lumot yetarli emas", Toast.LENGTH_SHORT).show()
            }



        }


    }
}