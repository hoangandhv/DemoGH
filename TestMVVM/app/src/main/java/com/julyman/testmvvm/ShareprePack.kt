package com.julyman.testmvvm

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import java.lang.reflect.Type

class ShareprePack: App() {
    private val context = mContext
    private var sharedPre: SharedPreferences = context.getSharedPreferences(context.packageName + "_preferences", Context.MODE_PRIVATE)
    private var editor: SharedPreferences.Editor = sharedPre.edit()
    fun checkExist(key: String): Boolean{
        return sharedPre.contains(key)
    }
    fun saveSharedPre(key: String, valueString: String) {       //    VD: ShareprePack(context).saveSharedPre("string","Nguyen van An")
        editor.putString(key, valueString)
        editor.commit()
    }

    fun <T> saveSharedPre(key: String, valueObjects: T) {       //    VD: ShareprePack(context).saveSharedPre("obj",productsObject)
        val valueJson = Gson().toJson(valueObjects)
        editor.putString(key, valueJson)
        editor.commit()
    }

    fun <T> saveSharedPre(key: String, listValue: List<T>) {     //    VD: ShareprePack(context).saveSharedPre("itemDetail",listProducts)
        val valueJson = Gson().toJson(listValue)
        editor.putString(key, valueJson)
        editor.commit()
    }

    fun getSharedPre(key: String): String {                       //    VD: val string = ShareprePack(context!!).getSharedPre("string")
        val value = sharedPre.getString(key, "No data")
        return value!!
    }


    fun <T> getSharedPre(key: String, objectModel: Class<T>): T {           //    VD: val object: ProductsItemYouLove = ShareprePack(context!!).getSharedPre("obj",ProductsItemYouLove::class.java)
        val value = sharedPre.getString(key, "No data")     //  TODO:  val objectModel ProductsItemYouLove::class.java
        val data: T = Gson().fromJson(value, objectModel)
        return data
    }


    fun <T> getSharedPre(key: String, typeListModel: Type): List<T> {       //    VD:
        val value = sharedPre.getString(key, "No data")      //    val type = object : TypeToken<List<ProductsItemYouLove>>(){}.type
        val data: List<T> = Gson().fromJson(value, typeListModel)           //    val listData: List<ProductsItemYouLove> = ShareprePack(context!!).getSharedPre("itemDetail", type )
        return data                                                         //TODO:  val typeListModel = object : TypeToken<List<ProductsItemYouLove>>(){}.type
    }


    fun remodeSharedPre(key: String){
        editor.remove(key).commit()
    }
    fun clearSharedPre(){
        editor.clear().commit()
    }
}