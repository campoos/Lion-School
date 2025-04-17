package br.senai.sp.jandira.lionschool

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.lionschool.screens.CoursesScreen
import br.senai.sp.jandira.lionschool.screens.GradeScreen
import br.senai.sp.jandira.lionschool.screens.HomeScreen
import br.senai.sp.jandira.lionschool.screens.StudentsScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navegacao = rememberNavController()

            NavHost(
                navController = navegacao,
                startDestination = "home"
            ){
                composable(route = "home"){ HomeScreen(navegacao) }
                composable(route = "courses"){ CoursesScreen(navegacao) }
                composable(route = "students"){ StudentsScreen(navegacao) }
                composable(route = "grade"){ GradeScreen(navegacao) }
            }
        }
    }
}

