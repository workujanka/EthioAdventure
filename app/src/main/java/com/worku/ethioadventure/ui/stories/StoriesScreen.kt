package com.worku.ethioadventure.ui.stories

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.worku.ethioadventure.data.sampleStories

@Composable
fun StoriesScreen() {
    LazyColumn(Modifier.padding(16.dp)) {
        items(sampleStories) { story ->
            Card(Modifier.fillMaxWidth().padding(bottom = 8.dp)) {
                Column(Modifier.padding(16.dp)) {
                    Text(story.title, style = MaterialTheme.typography.titleMedium)
                    Text(story.summary, style = MaterialTheme.typography.bodyMedium)
                }
            }
        }
    }
}
