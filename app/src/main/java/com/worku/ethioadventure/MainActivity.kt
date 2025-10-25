package com.worku.ethioadventure

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.worku.ethioadventure.navigation.EthioAdventureApp
import com.worku.ethioadventure.ui.theme.EthioAdventureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EthioAdventureTheme {
                EthioAdventureApp()
            }
        }
    }
}
