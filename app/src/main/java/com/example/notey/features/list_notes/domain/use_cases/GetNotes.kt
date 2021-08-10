package com.example.notey.features.list_notes.domain.use_cases

import com.example.notey.features.list_notes.domain.NoteRepository
import javax.inject.Inject

class GetNotes @Inject constructor(private val noteRepository: NoteRepository) {

    suspend operator fun invoke() =
        noteRepository.getNotes()
}