package com.stone.users.awais.personal.pregnancytrackercompose.navigation
sealed class Routes( val route : String ){
    object Splash : Routes(route = "splash")
    object Premium: Routes(route = "premium")
    object Dashboard: Routes(route = "dashboard")
}