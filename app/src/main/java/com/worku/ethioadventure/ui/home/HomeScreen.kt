package com.worku.ethioadventure.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(onNavigate: (String) -> Unit) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("EthioAdventure") }) }
    ) { padding ->
        Column(Modifier.padding(padding).padding(16.dp)) {
            Button(onClick = { onNavigate("stories") }) { Text("Stories") }
            Spacer(Modifier.height(8.dp))
            Button(onClick = { onNavigate("places") }) { Text("Places") }
            Spacer(Modifier.height(8.dp))
            Button(onClick = { onNavigate("quiz/ankober") }) { Text("Quick Quiz") }
        }
    }
}

