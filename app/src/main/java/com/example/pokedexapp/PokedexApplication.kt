package com.example.pokedexapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * Created by Dilara Kiraz on 19.09.2024.
 */

@HiltAndroidApp
class PokedexApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}