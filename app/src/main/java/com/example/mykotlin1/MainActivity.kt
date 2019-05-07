package com.example.mykotlin1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Sinhvien("Nguyễn Văn An")
        tvShow.text="Chào Kotlin"
    }
 fun Sinhvien(name:String){
     Log.d("123",name)
 }
}
