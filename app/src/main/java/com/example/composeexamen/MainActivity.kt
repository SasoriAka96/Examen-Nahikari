package com.example.composeexamen

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexamen.ui.theme.ComposeExamenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeExamenTheme {
                GreetingPreview()
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .background(Color.Gray)
                .height(120.dp)
                .width(340.dp)
                .padding(bottom = 40.dp)
        ) {
            Column(
                modifier = Modifier
                    .background(Color.Red)
            ) {
                Text(text = "Hello Android!")
                Text(text = "Hello Android!")
                Text(text = "Hello Android!")
            }


        }

        Column(
            modifier = Modifier
                .background(Color.White)
                .height(100.dp)
                .width(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Hello Android!")
        }

        Row(
            modifier = Modifier
                .background(Color.Green)
                .padding(start = 20.dp)
                .padding(end = 20.dp),
        ) {
            Column(
                modifier = Modifier.background(Color.Blue),

                ) {
                Button(
                    onClick = { },
                    Modifier
                        .height(60.dp)
                        .width(60.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
                ) {
                    Text(text = "1")
                }
                Button(
                    onClick = { },
                    Modifier
                        .height(60.dp)
                        .width(60.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
                ) {
                    Text(text = "2")
                }
                Button(
                    onClick = { },
                    Modifier
                        .height(60.dp)
                        .width(60.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
                ) {
                    Text(text = "3")
                }
            }
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .padding(start = 10.dp)
                    .padding(end = 10.dp),
            ) {

            }
            Column(
                modifier = Modifier
                    .background(Color.Magenta)
                    .padding(start = 40.dp)
                    .padding(end = 40.dp),
            ) {
                Button(
                    onClick = { },
                    Modifier
                        .height(60.dp)
                        .width(60.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
                ) {
                    Text(text = "4")
                }
                Button(
                    onClick = { },
                    Modifier
                        .height(60.dp)
                        .width(60.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
                ) {
                    Text(text = "5")
                }
                Button(
                    onClick = { },
                    Modifier
                        .height(60.dp)
                        .width(60.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
                ) {
                    Text(text = "6")
                }
            }
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .padding(start = 10.dp)
                    .padding(end = 10.dp),
            ) {

            }
            Column(
                modifier = Modifier.background(Color.Black),
            ) {
                Button(
                    onClick = { },
                    Modifier
                        .height(60.dp)
                        .width(60.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
                ) {
                    Text(text = "7")
                }
                Button(
                    onClick = { },
                    Modifier
                        .height(60.dp)
                        .width(60.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
                ) {
                    Text(text = "8")
                }
                Button(
                    onClick = { },
                    Modifier
                        .height(60.dp)
                        .width(60.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
                ) {
                    Text(text = "9")
                }
            }


        }
    }
}