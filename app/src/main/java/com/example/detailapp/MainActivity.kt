package com.example.detailapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Body(LocalContext.current)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Body(context : Context) {

    Column(
        verticalArrangement= Arrangement.Center,
        modifier= Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .background(color = Color(0xFF27374D))
            .padding(55.dp)
    )
    {
        var name by remember{ mutableStateOf("") }
        var email by remember{ mutableStateOf("") }
        var loc by remember{ mutableStateOf("") }
        var mobile by remember{ mutableStateOf("") }

        Text(text="Name",color=Color.White)

        TextField(value = name, onValueChange = {name=it})

        Text(text="Email",color=Color.White)

        TextField(value = email, onValueChange = {email=it})

        Text(text="Location",color=Color.White)

        TextField(value = loc, onValueChange = {loc=it})

        Text(text="Mobile No.",color=Color.White)

        TextField(value = mobile, onValueChange = {mobile=it})

        Text(text=" ")

        Row()
        {
            Button(onClick = { /*TODO*/ }) {
                Text(text="Toast")
            }

            Text(text="                            ")

            Button(onClick = { /*TODO*/ }) {
                Text(text="Text")
            }
        }

        Text(text=" ")

        Row(
        ){

            Text(text="                         ")

            Button(onClick = {
                val k= Intent(context,MainActivity2::class.java)
                k.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                k.putExtra("name",name)
                k.putExtra("email",email)
                k.putExtra("loc",loc)
                k.putExtra("mobile",mobile)

                context.startActivity(k)
            }) {
                Text(text="Next")
            }
        }

    }
}