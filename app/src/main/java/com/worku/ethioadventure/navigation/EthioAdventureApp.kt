package com.worku.ethioadventure.navigation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.worku.ethioadventure.ui.home.HomeScreen
import com.worku.ethioadventure.ui.places.PlacesScreen
import com.worku.ethioadventure.ui.quiz.QuizScreen
import com.worku.ethioadventure.ui.stories.StoriesScreen

@Composable
fun EthioAdventureApp() {
    MaterialTheme {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "home") {
            composable("home") {
                HomeScreen(onNavigate = { route -> navController.navigate(route) })
            }
            composable("stories") { StoriesScreen() }
            composable("places") { PlacesScreen() }
            composable("quiz/{storyId}") { backStackEntry ->
                val storyId = backStackEntry.arguments?.getString("storyId") ?: "default"
                QuizScreen(storyId = storyId)
            }
        }
    }
}
