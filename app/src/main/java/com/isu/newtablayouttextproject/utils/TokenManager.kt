package com.isu.newtablayouttextproject.utils

import android.content.Context
import com.isu.newtablayouttextproject.utils.IrctcSdkConstants.IRCTC_ID
import com.isu.newtablayouttextproject.utils.IrctcSdkConstants.PREFS_TOKEN_FILE


class TokenManager(private val context: Context) {
    private val prefs = context.getSharedPreferences(PREFS_TOKEN_FILE,Context.MODE_PRIVATE)

    fun saveToken(irctcId:String){
        val editor= prefs.edit()
        editor.putString(IRCTC_ID,irctcId)
        editor.apply()
    }
    fun getToken() : String? {
        return prefs.getString(IRCTC_ID,null)
    }
}