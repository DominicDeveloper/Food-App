package com.dominic.makefood.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.dominic.makefood.Model.Food
import com.dominic.makefood.R
import kotlinx.android.synthetic.main.item_ru.view.*

class MyAdapter(context: Context,val list:List<Food>):ArrayAdapter<Food>(context, R.layout.item_ru,list) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemView:View
        if (convertView == null){
            itemView  = LayoutInflater.from(parent.context).inflate(R.layout.item_ru,parent,false)
        }else{
            itemView = convertView
        }
        itemView.txt_name.text = list[position].name
        return itemView
    }
}