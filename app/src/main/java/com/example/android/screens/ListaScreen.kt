package com.example.android.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ListaScreen(
    navController: NavController
) {
    //para estructurar elementos tipicos de material design
    Scaffold (
        topBar = {
            TopAppBar() {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow back",
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                    }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Lista de Asistentes")
            }
        }
    ){

        ListaBodyContent(navController)
    }
}

@Composable
fun ListaBodyContent(navController: NavController){
    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = {
            navController.popBackStack()
        }
    ) {
        Text(text = "Volver Atras")
    }
}




