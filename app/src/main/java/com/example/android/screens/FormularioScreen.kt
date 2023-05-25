package com.example.android.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.android.navigation.AppScreens

@Composable
fun FormularioScreen(navController: NavController) {
    //para estructurar elementos tipicos de material design
    Scaffold (
        topBar = {
            TopAppBar() {
                Text(text = "Formulario de Registro")
            }
        }
    ) {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize())
    {
        Text("Formulario")
        Button(onClick = {
            navController.navigate(route=AppScreens.ListaScreen.route)
        }) {
            Text("Navega")
        }

    }

}



