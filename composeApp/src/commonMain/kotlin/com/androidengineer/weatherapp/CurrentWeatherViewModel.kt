package com.androidengineer.weatherapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class CurrentWeatherViewModel(
    private val api: WeatherApi = WeatherApi(ApiClient.client)
) : ViewModel() {

    private val _weatherState = MutableStateFlow(WeatherResponse())
    val weatherState: StateFlow<WeatherResponse> = _weatherState

    init {
        fetchWeather(38.7795, -9.3401)
    }

    fun fetchWeather(lat: Double, lon: Double) {
        viewModelScope.launch {
            try {
                val result = api.getWeather(lat, lon)
                _weatherState.value = result
            } catch (e: Exception) {
               println("Error fetching weather: ${e.message}")
            }
        }
    }
}