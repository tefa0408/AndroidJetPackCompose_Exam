package com.example.android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.android.screens.FormularioScreen
import com.example.android.screens.ListaScreen

@Composable
fun AppNavigation(){
    val navController= rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.FormularioScreen.route
    ){
        composable(route=AppScreens.FormularioScreen.route){
            FormularioScreen(navController)
        }
        composable(route=AppScreens.ListaScreen.route){
            ListaScreen(navController)
        }
    }
}