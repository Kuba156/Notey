package com.example.notey.features.list_notes.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.notey.features.list_notes.domain.use_cases.GetNotes
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class NoteViewModel @Inject constructor (
    val getNotes: GetNotes
) : ViewModel() {

    var notes: MutableLiveData<List<NotePresentationEntity>> = MutableLiveData()

    fun loadNotes() {
        GlobalScope.launch {
            notes.postValue(getNotes.invoke().map {
                NotePresentationEntity(
                    it.id,
                    it.title,
                    it.content,
                    it.createTimestamp,
                    it.updateTimestamp
                )
            })
        }
    }
}