package com.worku.ethioadventure.data

data class Story(
    val id: String,
    val title: String,
    val summary: String,
    val imageRes: Int? = null
)

val sampleStories = listOf(
    Story("ankober", "Ankober Legend", "A tale from the highlands..."),
    Story("lalibela", "Lalibela Wonders", "Children explore rock-hewn churches...")
)

data class Place(
    val id: String,
    val name: String,
    val region: String,
    val note: String
)

val samplePlaces = listOf(
    Place("lalibela", "Lalibela", "Amhara", "Rock-hewn churches and festivals."),
    Place("axum", "Axum", "Tigray", "Obelisks and ancient history.")
)
