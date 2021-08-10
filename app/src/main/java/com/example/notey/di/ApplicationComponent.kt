package com.example.notey.di

import com.example.notey.AndroidApplication
import com.example.notey.features.list_notes.presentation.ListNotesFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, ViewModelModule::class, DatabaseModule::class])
interface ApplicationComponent {

    fun inject(application: AndroidApplication)

    fun inject(listNotesFragment: ListNotesFragment)

}