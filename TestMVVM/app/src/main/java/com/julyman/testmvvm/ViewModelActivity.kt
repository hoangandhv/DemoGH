package com.julyman.testmvvm

import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ViewModelActivity {
    var namePlayer = MutableLiveData<Boolean>()
    var state = MutableLiveData<String>()
//    var state = ObservableField<String>()
//    var state = MutableLiveData<EditProfileState>()

    fun getState(): LiveData<String> {
        return state
    }
    fun setStateValue(string: String){
        state.value = string
    }
//    fun setTrue(){
//        state.postValue(EditProfileState(isCityDialogShown = true))
//        namePlayer.postValue(state.value?.isCityDialogShown)
//        Log.d("AAA","${state.value?.isCityDialogShown}")
//    }
//    fun setFalse(){
//        state.postValue(EditProfileState(isCityDialogShown = false))
//        namePlayer.postValue(state.value?.isCityDialogShown)
//        Log.d("AAA","${state.value?.isCityDialogShown}")
//    }
}