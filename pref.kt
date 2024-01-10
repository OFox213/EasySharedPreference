package com.devstudio.gamecenter.util

import android.content.Context
import android.content.SharedPreferences

class pref {
    private val PREF_KEY = "common"

    fun setString(context:Context, key:String, value:String){
        val pref = getPreference(context)
        pref.edit().putString(key, value).apply()
    }
    fun setBoolean(context:Context, key:String, value:Boolean){
        val pref = getPreference(context)
        pref.edit().putBoolean(key, value).apply()
    }
    fun setInt(context:Context, key:String, value:Int){
        val pref = getPreference(context)
        pref.edit().putInt(key, value).apply()
    }
    fun getString(context: Context, key: String, defaultValue:String): String {
        return getPreference(context).getString(key, defaultValue).toString()
    }
    fun getBoolean(context: Context, key: String, defaultValue:Boolean): Boolean {
        return getPreference(context).getBoolean(key, defaultValue)
    }
    fun getInt(context: Context, key: String, defaultValue:Int): Int {
        return getPreference(context).getInt(key, defaultValue)
    }

    private fun getPreference(context:Context) : SharedPreferences{
        return context.getSharedPreferences(PREF_KEY, Context.MODE_PRIVATE)
    }
}