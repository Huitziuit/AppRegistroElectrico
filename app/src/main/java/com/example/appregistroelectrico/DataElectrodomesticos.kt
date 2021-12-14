package com.example.appregistroelectrico

import android.content.Context
import android.preference.PreferenceManager
import com.google.gson.Gson


class DataElectrodomesticos {

    val key = "OBJ"

    fun saveData(electrodomestico: Electrodomestico, con: Context){
        val electrodomesticosSave=loadData(con)
        if(electrodomesticosSave.total==0) {
            val electrodomesticos=Electrodomesticos()
            electrodomesticos.add(electrodomestico)
            val jsonString = Gson().toJson(electrodomesticos)

            val pref = PreferenceManager.getDefaultSharedPreferences(con)
            val editor = pref.edit()
            editor.putString(key, jsonString)
            editor.apply()
        }else{
            electrodomesticosSave.add(electrodomestico)
            val jsonString = Gson().toJson(electrodomesticosSave)

            val pref = PreferenceManager.getDefaultSharedPreferences(con)
            val editor = pref.edit()
            editor.putString(key, jsonString)
            editor.apply()
        }

    }

    fun loadData( con: Context): Electrodomesticos {

        var pref=PreferenceManager.getDefaultSharedPreferences(con)
        var jsonString = pref.getString(key, null)
        var auxElectrodomesticos=Electrodomesticos()
        if(jsonString!=null) {
            auxElectrodomesticos = Gson().fromJson(jsonString, Electrodomesticos::class.java)
        }
        return auxElectrodomesticos
    }

    fun deleteForIndex(con: Context, index:Int){
        val electrodomesticosSave=loadData(con)
        if(electrodomesticosSave.total>0) {
            electrodomesticosSave.delete(index)

            val jsonString = Gson().toJson(electrodomesticosSave)

            val pref = PreferenceManager.getDefaultSharedPreferences(con)
            val editor = pref.edit()
            editor.putString(key, jsonString)
            editor.apply()
        }
    }

    fun updateElect(con: Context, index: Int, electrodomestico: Electrodomestico){
        val electrodomesticosSave=loadData(con)
        if(index <= electrodomesticosSave.total) {
            electrodomesticosSave.update(index,electrodomestico)
            val jsonString = Gson().toJson(electrodomesticosSave)

            val pref = PreferenceManager.getDefaultSharedPreferences(con)
            val editor = pref.edit()
            editor.putString(key, jsonString)
            editor.apply()
        }
    }
}


