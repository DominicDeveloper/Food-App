package com.dominic.makefood.Cache

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import android.content.Context
import android.content.SharedPreferences
import com.dominic.makefood.Model.Food
import com.google.gson.reflect.TypeToken

object MyShared {
    private const val NAME = "CacheStroge"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences

    fun init(context: Context){
        preferences = context.getSharedPreferences(NAME, MODE)
    }
    private inline fun SharedPreferences.edit(operaton: (SharedPreferences.Editor) -> Unit){
        val editor = edit()
        operaton(editor)
        editor.apply()
    }
    var objectString:ArrayList<Food>
        get() = gsonStringToArray(preferences.getString("object","[]")!!)
        set(value) = preferences.edit{
        if (value != null){
            it.putString("object",arrayToGsonString(value))
        }
    }
    fun arrayToGsonString(arrayList: ArrayList<Food>):String{

        return Gson().toJson(arrayList)
    }
    fun gsonStringToArray(gsonString:String):ArrayList<Food>{
        val typeToken = object: TypeToken<ArrayList<Food>>(){}.type
        return Gson().fromJson(gsonString,typeToken)
    }
}