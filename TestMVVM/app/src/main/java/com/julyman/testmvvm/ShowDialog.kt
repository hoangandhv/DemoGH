package com.julyman.testmvvm

import android.app.Dialog
import android.content.Context

class ShowDialog(val context: Context){
    fun showDialog(){
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.item_dialog)
        dialog.show()
    }

}