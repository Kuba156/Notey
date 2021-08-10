package com.example.notey.features.list_notes.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(NoteDbEntity::class), version = 1)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}