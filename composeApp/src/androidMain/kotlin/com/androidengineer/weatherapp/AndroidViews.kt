package com.androidengineer.weatherapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.maps.android.compose.GoogleMap

actual @Composable
fun MapView(modifier: Modifier) {
    GoogleMap(
        modifier = modifier,
        onMapClick = { latLng ->
        }
    )
}