package com.mightysana.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewComposable()
        }
    }

    @Composable
    fun PreviewComposable() {
        Row(
            modifier = Modifier
                .background(Color.Magenta)
                .fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.Top
        ) {
            Text("Hello", modifier = Modifier.background(Color.Black), color = Color.White)
            Text("Minatozaki", modifier = Modifier.background(Color.Yellow))
            Text("Sana", modifier = Modifier.background(Color.Red))
        }
    }

//    @Preview(showBackground = true)
//    @Composable
//    fun PreviewComposableShow() {
//        PreviewComposable()
//    }
}