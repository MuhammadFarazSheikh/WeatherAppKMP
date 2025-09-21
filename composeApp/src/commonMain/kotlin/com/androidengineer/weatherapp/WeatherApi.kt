package com.androidengineer.weatherapp

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText

class WeatherApi(private val client: HttpClient) {
    suspend fun getWeather(lat: Double, lon: Double): WeatherResponse {
        val url = "https://api.weatherapi.com/v1/forecast.json?key=5a5bf784f73546f48cb225751252706&q=$lat,$lon&days=3"
        println("Request URL: $url")

        val response: HttpResponse = client.get(url)
        val rawBody = response.bodyAsText()
        println("Raw API response: $rawBody")

        return response.body()
    }
}