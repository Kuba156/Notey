package com.example.notey

import android.app.Application
import com.example.notey.di.ApplicationComponent
import com.example.notey.di.ApplicationModule
import com.example.notey.di.DaggerApplicationComponent

class AndroidApplication : Application() {
    val appComponent: ApplicationComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        this.injectMembers()
    }

    private fun injectMembers() =
        appComponent.inject(this)
}