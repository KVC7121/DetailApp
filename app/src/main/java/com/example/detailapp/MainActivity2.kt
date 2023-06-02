package com.example.detailapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

class MainActivity2 : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                verticalArrangement=Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            modifier=Modifier.fillMaxSize().fillMaxWidth()
            )
            {
                Card(

                )
                {
                    Column() {
                        var v1: String
                        var v2: String
                        var v3: String
                        var v4: String

                        v1 = intent.getStringExtra("name").toString()
                        v2 = intent.getStringExtra("email").toString()
                        v3 = intent.getStringExtra("loc").toString()
                        v4 = intent.getStringExtra("mobile").toString()

                        Text(text = "Name: " + v1)
                        Text(text = " ")
                        Text(text = "Name: " + v2)
                        Text(text = " ")
                        Text(text = "Name: " + v3)
                        Text(text = " ")
                        Text(text = "Name: " + v4)
                        Text(text = " ")
                    }
                }

            }
        }
    }
}