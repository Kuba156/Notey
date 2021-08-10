package com.example.notey.di

import android.content.Context
import androidx.room.Room
import com.example.notey.features.list_notes.domain.NoteRepository
import com.example.notey.AndroidApplication
import com.example.notey.features.list_notes.data.NoteDao
import com.example.notey.features.list_notes.data.NoteDatabase
import com.example.notey.features.list_notes.data.RoomNoteDataSource
import com.example.notey.features.list_notes.domain.NoteDataSource
import com.example.notey.features.list_notes.domain.use_cases.GetNotes
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: AndroidApplication) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context =
        application

    @Singleton
    @Provides
    fun provideDatabase(applicationContext: Context) : NoteDatabase =
        Room.databaseBuilder(
            applicationContext,
            NoteDatabase::class.java,
            "notes-db"
        ).build()

    @Singleton
    @Provides
    fun provideNoteDao(noteDatabase: NoteDatabase) : NoteDao =
        noteDatabase.noteDao()

    @Singleton
    @Provides
    fun provideNoteDataSource(noteDao: NoteDao) : NoteDataSource =
        RoomNoteDataSource(noteDao)
}