package com.example.notey.features.list_notes.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.notey.features.list_notes.domain.NoteEntity

@Entity(tableName = "note")
data class NoteDbEntity(
    @PrimaryKey var id: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "create_timestamp") val createTimestamp: String,
    @ColumnInfo(name = "update_timestamp") val updateTimestamp: String
) {
    fun translate() =
        NoteEntity(
            id,
            title,
            content,
            createTimestamp,
            updateTimestamp
        )
}