package com.example.notey.features.list_notes.domain

data class NoteEntity(
    val id: String,
    val title: String,
    val content: String,
    val createTimestamp: String,
    val updateTimestamp: String
)