package com.example.tryingandroid

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tryingandroid.ui.theme.TryingAndroidTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TryingAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(message="VEER SINGH",from="SAT SRI AKAL")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String,from:String,modifier: Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.Center, modifier = modifier.padding(8.dp)
    ){
        Row {
            Text(
                text = message,
                fontSize = 111.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center
            )
        }
        Row {
            Text(
                text = from,
                fontSize = 52.sp,
                textAlign = TextAlign.End,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}





@Preview(showBackground = true,
    name= "Just a preview",
    showSystemUi = true
    )
@Composable
fun GreetingPreview() {
    TryingAndroidTheme {
        Surface(color= Color.Cyan) {
            GreetingText(message="VEER SINGH",from="SAT SRI AKAL")
        }
    }
}