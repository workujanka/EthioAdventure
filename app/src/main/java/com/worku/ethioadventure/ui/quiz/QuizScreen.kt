package com.worku.ethioadventure.ui.quiz

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun QuizScreen(storyId: String) {
    var selected by remember { mutableStateOf<String?>(null) }
    var submitted by remember { mutableStateOf(false) }

    val question = "Which region is Lalibela in?"
    val options = listOf("Oromia", "Amhara", "Tigray", "Somali")
    val correct = "Amhara"

    Column(Modifier.padding(16.dp)) {
        Text("Quiz for: $storyId", style = MaterialTheme.typography.titleMedium)
        Text(question, style = MaterialTheme.typography.bodyLarge)
        Spacer(Modifier.height(8.dp))
        options.forEach { opt ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(selected = (selected == opt), onClick = { selected = opt })
                Text(opt)
            }
        }
        Spacer(Modifier.height(8.dp))
        Button(onClick = { submitted = true }, enabled = selected != null) { Text("Submit") }
        if (submitted) {
            val result = if (selected == correct) "Correct!" else "Try again."
            Text(result, style = MaterialTheme.typography.bodyLarge)
        }
    }
}
