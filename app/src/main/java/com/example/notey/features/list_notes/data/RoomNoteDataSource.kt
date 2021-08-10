package com.example.notey.features.list_notes.data

import com.example.notey.features.list_notes.domain.NoteDataSource
import com.example.notey.features.list_notes.domain.NoteEntity

class RoomNoteDataSource (private val noteDao: NoteDao) : NoteDataSource {

    override suspend fun add(note: NoteEntity) {
        noteDao.insert(
            NoteDbEntity(
                note.id,
                note.title,
                note.content,
                note.createTimestamp,
                note.updateTimestamp
            )
        )
    }

    override suspend fun getAll(): List<NoteEntity> {
        val noteDbEntities = noteDao.getAll()
        return noteDbEntities.map {
            it.translate()
        }
    }

    override suspend fun delete(note: NoteEntity) {
        noteDao.delete(
            NoteDbEntity(
                note.id,
                note.title,
                note.content,
                note.createTimestamp,
                note.updateTimestamp
            )
        )
    }
}