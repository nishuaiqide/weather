package com.example.a32002007njtweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SunnyWeatherApplication : Application() {
    companion object {
        const val TOKEN = "mResCh3EvZPLdDwc"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}
