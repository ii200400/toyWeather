package com.example.toyweather.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestModel: ViewModel() {
    val number = MutableLiveData(0)
    val isRefresh = MutableLiveData(false)

    fun increase(){
        isRefresh.value = (true)
        number.value = (number.value ?: 0) + 1
        isRefresh.value = false
    }
}