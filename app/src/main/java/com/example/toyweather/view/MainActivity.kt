package com.example.toyweather.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.toyweather.R
import com.example.toyweather.databinding.ActivityMainBinding
import com.example.toyweather.databinding.CurrentWeatherLayoutBinding
import com.example.toyweather.viewModel.TestModel

class MainActivity : AppCompatActivity() {

    // data binding
    private val mainBinding: ActivityMainBinding by lazy { DataBindingUtil.setContentView(this, R.layout.activity_main) }
    private val currentWeatherBinding: CurrentWeatherLayoutBinding by lazy { DataBindingUtil.setContentView(this, R.layout.current_weather_layout) }

    // view model
    private val testModel by lazy { ViewModelProvider(this).get(TestModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding.lifecycleOwner = this
        mainBinding.testModel = testModel
    }
}
