package com.julyman.testmvvm

import android.app.Application
import android.content.Context

open class App: Application() {
    companion object{
        lateinit var mContext: Context
    }
    override fun onCreate() {
        super.onCreate()
        mContext = applicationContext
    }
}