package com.example.toyweather.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.toyweather.model.WeatherForecast

// MVVM 패턴을 기반으로
// ViewModel과 LiveData를 활용하여 UI 갱신이 자동화 되도록 만든다.

class WeatherForecastModel: ViewModel() {
    val weatherForecastModel = MutableLiveData<WeatherForecast>()
    // val messagner =

    fun refresh(){
        
    }
}