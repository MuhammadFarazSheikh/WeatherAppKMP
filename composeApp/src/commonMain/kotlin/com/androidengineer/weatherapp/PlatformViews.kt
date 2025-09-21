package com.androidengineer.weatherapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap

@Composable
expect fun MapView(lat: Double, lng: Double, modifier: Modifier = Modifier)

expect suspend fun loadImageFromUrl(url: String): ImageBitmap?