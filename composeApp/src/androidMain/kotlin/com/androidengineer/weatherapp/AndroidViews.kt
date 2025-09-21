package com.androidengineer.weatherapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.maps.android.compose.GoogleMap
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import android.graphics.BitmapFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState
import com.google.maps.android.compose.rememberMarkerState
import java.net.URL

@Composable
actual fun MapView(lat: Double, lng: Double, modifier: Modifier) {

    val initialPosition = LatLng(lat, lng)

    val initialZoom = 10f

    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(initialPosition, initialZoom)
    }

    GoogleMap(
        modifier = modifier,
        cameraPositionState = cameraPositionState,
        uiSettings = MapUiSettings(
            zoomControlsEnabled = true,
            zoomGesturesEnabled = true
        )
    ) {
        Marker(rememberMarkerState(position = initialPosition), title = "Clicked Location")
    }
}

actual suspend fun loadImageFromUrl(url: String): ImageBitmap? {
    println(url)
    return withContext(Dispatchers.IO) {
        try {
            val input = URL("https:$url").openStream()
            val bitmap = BitmapFactory.decodeStream(input)
            bitmap?.asImageBitmap()
        } catch (e: Exception) {
            println("Failed to load image Android: ${e.message}")
            null
        }
    }
}