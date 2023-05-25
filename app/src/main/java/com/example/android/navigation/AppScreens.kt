package com.example.android.navigation

sealed class AppScreens(val route:String){
    object FormularioScreen: AppScreens("formulario_screen")
    object ListaScreen: AppScreens("lista_screen")
}

