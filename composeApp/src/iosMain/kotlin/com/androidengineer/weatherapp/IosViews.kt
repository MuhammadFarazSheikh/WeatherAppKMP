package com.androidengineer.weatherapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import platform.Foundation.*
import platform.UIKit.UIImage
import org.jetbrains.skiko.Image

@Composable
actual fun MapView(lat: Double, lng: Double, modifier: Modifier) {}


actual suspend fun loadImageFromUrl(url: String): ImageBitmap? = withContext(Dispatchers.Default) {
    try {
        val nsUrl = NSURL.URLWithString(url) ?: return@withContext null
        val data = NSData.dataWithContentsOfURL(nsUrl) ?: return@withContext null
        val uiImage = UIImage(data = data) ?: return@withContext null

        // Convert UIImage to SKIKO Image then to ImageBitmap
        val cgImage = uiImage.CGImage ?: return@withContext null
        val skImage = Image.makeFromCGImage(cgImage)
        skImage.toComposeImageBitmap() // Compose Multiplatform extension
    } catch (e: Exception) {
        println("Failed to load image iOS: ${e.message}")
        null
    }
}