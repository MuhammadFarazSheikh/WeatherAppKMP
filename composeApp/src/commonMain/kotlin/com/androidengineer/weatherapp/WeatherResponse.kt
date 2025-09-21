package com.androidengineer.weatherapp

import kotlinx.serialization.Serializable

@Serializable
data class WeatherResponse(
    val location: Location = Location(),
    val current: Current = Current(),
    val forecast: Forecast = Forecast()
)

@Serializable
data class Location(
    val name: String = "",
    val region: String = "",
    val country: String = "",
    val localtime: String = "",
    val lat: Double = 0.0,
    val lon: Double = 0.0
)

@Serializable
data class Current(
    val last_updated_epoch: Long = 0L,
    val last_updated: String = "",
    val temp_c: Double = 0.0,
    val temp_f: Double = 0.0,
    val condition: Condition = Condition(),
    val wind_mph: Double = 0.0,
    val wind_kph: Double = 0.0,
    val wind_dir: String = "",
    val humidity: Int = 0,
    val feelslike_c: Double = 0.0,
    val feelslike_f: Double = 0.0,
)

@Serializable
data class Condition(
    val text: String = "",
    val icon: String = "",
    val code: Int = 0
)

@Serializable
data class Forecast(
    val forecastday: List<Forecastday> = emptyList()
)

@Serializable
data class Forecastday(
    val date: String = "",
    val day: Day = Day(),
    val astro: Astro = Astro(),
    val hour: List<Hour> = emptyList()
)

@Serializable
data class Day(
    val maxtemp_c: Double = 0.0,
    val maxtemp_f: Double = 0.0,
    val mintemp_c: Double = 0.0,
    val mintemp_f: Double = 0.0,
    val avgtemp_c: Double = 0.0,
    val avgtemp_f: Double = 0.0,
    val maxwind_mph: Double = 0.0,
    val maxwind_kph: Double = 0.0,
    val avghumidity: Int = 0,
    val daily_will_it_rain: Int = 0,
    val daily_chance_of_rain: Int = 0,
    val daily_will_it_snow: Int = 0,
    val daily_chance_of_snow: Int = 0,
    val condition: Condition = Condition(),
    val uv: Double = 0.0
)

@Serializable
data class Astro(
    val sunrise: String = "",
    val sunset: String = "",
    val moonrise: String = ""
)

@Serializable
data class Hour(
    val time: String = "",
    val temp_c: Double = 0.0,
    val temp_f: Double = 0.0,
    val condition: Condition = Condition(),
    val wind_mph: Double = 0.0,
    val wind_kph: Double = 0.0,
    val wind_dir: String = "",
    val humidity: Int = 0,
    val feelslike_c: Double = 0.0,
    val feelslike_f: Double = 0.0,
    val will_it_rain: Int = 0,
    val chance_of_rain: Int = 0,
    val will_it_snow: Int = 0,
    val chance_of_snow: Int = 0,
    val uv: Double = 0.0
)