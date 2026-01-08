package com.example.firebase.view.ControlNavigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.firebase.view.DetailSiswaScreen
import com.example.firebase.view.EditSiswaScreen
import com.example.firebase.view.EntrySiswaScreen
import com.example.firebase.view.HomeScreen
import com.example.firebase.view.route.DestinasiDetail
import com.example.firebase.view.route.DestinasiEdit
import com.example.firebase.view.route.DestinasiEntry
import com.example.firebase.view.route.DestinasiHome
@Composable
fun DataSiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
) {
    HostNavigasi(navController = navController)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ) {
