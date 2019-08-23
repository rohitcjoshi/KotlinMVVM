package com.application.mvvm

import android.app.Application


class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        context = this
    }

    companion object {
        var context: AppApplication? = null
            private set
    }
}