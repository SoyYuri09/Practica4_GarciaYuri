package yuri.garcia.practica4_garciayuri.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import androidx.navigation.compose.rememberNavController
import yuri.garcia.practica4_garciayuri.ui.screens.LoginScreen
import yuri.garcia.practica4_garciayuri.ui.screens.PokemonDetail
import yuri.garcia.practica4_garciayuri.ui.screens.PokemonScreens

@Composable
fun AppNavigation() {
    val navController = rememberNavController() //Es para que cuando se renderice, recuerde el estado anterior en este caso la navegación

    NavHost(navController = navController, startDestination = "login"){ //Recibe un controlador como parámetro y la ruta que iniciará por default (En el NavHost se ponen las rutas)
        composable(Routes.LOGIN_SCREEN){ //Aquí va la funcion
            LoginScreen({navController.navigate(Routes.POKEMON_LIST_SCREEN)})
        }
        composable(Routes.POKEMON_LIST_SCREEN){
            PokemonScreens({navController.navigate(Routes.POKEMON_DETAIL)})
        }
        composable(Routes.POKEMON_DETAIL){
            PokemonDetail()
        }
    }

}
object Routes {
    const val LOGIN_SCREEN = "login"
    const val POKEMON_LIST_SCREEN = "list"
    const val POKEMON_DETAIL = "detail"
}
