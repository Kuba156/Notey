package com.example.notey.features.list_notes.presentation

data class NotePresentationEntity(
    val id: String,
    val title: String,
    val content: String,
    val createTimestamp: String,
    val updateTimestamp: String
)