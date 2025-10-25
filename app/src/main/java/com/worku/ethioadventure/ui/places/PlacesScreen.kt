package com.worku.ethioadventure.ui.places

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import com.worku.ethioadventure.data.samplePlaces

@Composable
fun PlacesScreen() {
    LazyColumn(Modifier.padding(16.dp)) {
        items(samplePlaces) { place ->
            ListItem(
                headlineContent = { Text(place.name) },
                supportingContent = { Text("${place.region} • ${place.note}") }
            )
            Divider()
        }
    }
}

