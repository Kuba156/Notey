package com.example.notey.features.list_notes.domain

interface NoteDataSource {

    suspend fun add(note: NoteEntity)

    suspend fun getAll(): List<NoteEntity>

    suspend fun delete(note: NoteEntity)
}