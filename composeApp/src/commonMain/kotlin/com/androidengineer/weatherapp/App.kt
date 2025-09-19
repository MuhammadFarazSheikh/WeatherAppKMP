package com.androidengineer.weatherapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import weatherapp.composeapp.generated.resources.Res
import weatherapp.composeapp.generated.resources.weather
import weatherapp.composeapp.generated.resources.clock
import weatherapp.composeapp.generated.resources.humidity
import weatherapp.composeapp.generated.resources.wind_direction
import weatherapp.composeapp.generated.resources.feels_like
import weatherapp.composeapp.generated.resources.wind

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFB3E5FC), Color(0xFFE1F5FE)
                        )
                    )
                )
                .padding(40.dp, 70.dp, 40.dp, 0.dp),
            content = {
                Text(
                    text = "Lisboa, Portugal",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.wrapContentWidth().wrapContentHeight(),
                    content = {
                        Image(
                            modifier = Modifier.size(40.dp),
                            painter = painterResource(Res.drawable.weather),
                            contentDescription = ""
                        )

                        Text(
                            modifier = Modifier.padding(15.dp, 10.dp, 0.dp, 0.dp),
                            text = "30 \u00B0C",
                            fontSize = 35.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    })

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(0.dp, 20.dp, 0.dp, 0.dp)
                        .background(
                            color = Color(0x50FFFFFF), shape = RoundedCornerShape(10.dp)
                        ).padding(10.dp, 7.dp).wrapContentWidth().wrapContentHeight(),
                    content = {

                        Image(
                            modifier = Modifier.size(25.dp),
                            painter = painterResource(Res.drawable.clock),
                            contentDescription = ""
                        )

                        Text(
                            modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp),
                            text = "Date & Time",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                        Spacer(
                            modifier = Modifier.weight(1f)
                        )

                        Text(
                            text = "19 Sep 2025 03:05",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Gray
                        )
                    }
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(0.dp, 10.dp, 0.dp, 0.dp)
                        .background(
                            color = Color(0x50FFFFFF), shape = RoundedCornerShape(10.dp)
                        ).padding(10.dp, 7.dp).wrapContentWidth().wrapContentHeight(),
                    content = {

                        Image(
                            modifier = Modifier.size(25.dp),
                            painter = painterResource(Res.drawable.humidity),
                            contentDescription = ""
                        )

                        Text(
                            modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp),
                            text = "Humidity",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                        Spacer(
                            modifier = Modifier.weight(1f)
                        )

                        Text(
                            text = "83%",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Gray
                        )
                    }
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(0.dp, 10.dp, 0.dp, 0.dp)
                        .background(
                            color = Color(0x50FFFFFF), shape = RoundedCornerShape(10.dp)
                        ).padding(10.dp, 7.dp).wrapContentWidth().wrapContentHeight(),
                    content = {

                        Image(
                            modifier = Modifier.size(25.dp),
                            painter = painterResource(Res.drawable.wind),
                            contentDescription = ""
                        )

                        Text(
                            modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp),
                            text = "Wind",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                        Spacer(
                            modifier = Modifier.weight(1f)
                        )

                        Text(
                            text = "8 km/h",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Gray
                        )
                    }
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(0.dp, 10.dp, 0.dp, 0.dp)
                        .background(
                            color = Color(0x50FFFFFF), shape = RoundedCornerShape(10.dp)
                        ).padding(10.dp, 7.dp).wrapContentWidth().wrapContentHeight(),
                    content = {

                        Image(
                            modifier = Modifier.size(25.dp),
                            painter = painterResource(Res.drawable.wind_direction),
                            contentDescription = ""
                        )

                        Text(
                            modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp),
                            text = "Direction",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                        Spacer(
                            modifier = Modifier.weight(1f)
                        )

                        Text(
                            text = "West-Northwest",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Gray
                        )
                    }
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(0.dp, 10.dp, 0.dp, 0.dp)
                        .background(
                            color = Color(0x50FFFFFF), shape = RoundedCornerShape(10.dp)
                        ).padding(10.dp, 7.dp).wrapContentWidth().wrapContentHeight(),
                    content = {

                        Image(
                            modifier = Modifier.size(25.dp),
                            painter = painterResource(Res.drawable.feels_like),
                            contentDescription = ""
                        )

                        Text(
                            modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp),
                            text = "Feels",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                        Spacer(
                            modifier = Modifier.weight(1f)
                        )

                        Text(
                            text = "30 \u00B0C",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Gray
                        )
                    }
                )

                Row (
                    modifier = Modifier
                        .padding(0.dp, 10.dp, 0.dp, 0.dp)
                        .background(
                            color = Color(0x50FFFFFF), shape = RoundedCornerShape(10.dp)
                        ).padding(10.dp, 7.dp).wrapContentWidth().wrapContentHeight(),
                    content = {
                        MapView(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp)
                        )
                    }
                )
            }
        )
    }
}