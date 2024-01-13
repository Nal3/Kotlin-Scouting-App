package com.example.scouting_app_fuckery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.scouting_app_fuckery.ui.theme.ScoutingappfuckeryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScoutingappfuckeryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}


@Composable
fun Greeting(modifier: Modifier = Modifier) {
    var enteredText by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize().background(Color.Cyan),
        contentAlignment = Alignment.TopCenter
    ) {
        Text(
            modifier = Modifier.padding(top = 20.dp, bottom = 10.dp),
            text = "shit yourslef",
            fontSize = 30.sp
        )
        Box (
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .fillMaxHeight(0.2f)
                .padding(top = 70.dp)
                .border(2.dp, Color.Black)
                ,
            contentAlignment = Alignment.TopCenter
        ) {
            Text(
                modifier = Modifier
                    .padding(top = 5.dp,bottom = 5.dp),
                text = "Scout Name",
            )

            BasicTextField(
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .background(Color.White)
                    .padding(3.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .align(Alignment.Center)
                ,
                value = enteredText,
                onValueChange = { newInput:String -> enteredText = newInput },
                textStyle = TextStyle(fontSize = 18.sp, color = Color.Black),
            )


        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ScoutingappfuckeryTheme {
        Greeting()
    }
}