package com.example.notey.features.list_notes.domain

import javax.inject.Inject


class NoteRepository @Inject constructor(private val dataSource: NoteDataSource) {

    suspend fun addNote(note: NoteEntity) {
        dataSource.add(note)
    }

    suspend fun getNotes() : List<NoteEntity> {
        return dataSource.getAll()
    }

    suspend fun deleteNote(note: NoteEntity) {
        dataSource.delete(note)
    }
}