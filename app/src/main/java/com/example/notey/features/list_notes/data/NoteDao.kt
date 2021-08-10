package com.example.notey.features.list_notes.data

import androidx.room.*

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getAll(): List<NoteDbEntity>

    @Insert
    fun insert(vararg user: NoteDbEntity)

    @Update
    fun update(vararg user: NoteDbEntity)

    @Delete
    fun delete(user: NoteDbEntity)

}