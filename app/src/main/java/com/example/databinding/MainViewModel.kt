package com.example.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val name = MutableLiveData<String>()
    val boo = MutableLiveData<Boolean>()
    fun changeName() {
        name.value = "XOXO"
        boo.value = true
    }

    fun boolX(): Boolean {
        return boo.value ?: false
    }
}