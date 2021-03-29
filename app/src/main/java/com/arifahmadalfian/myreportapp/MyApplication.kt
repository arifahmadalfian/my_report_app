package com.arifahmadalfian.myreportapp

import android.app.Application
import com.arifahmadalfian.myreportapp.utils.ReleaseTree
import timber.log.Timber

open class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(ReleaseTree())
        }
    }
}