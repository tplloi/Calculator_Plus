package com.roy.calculator

import android.app.Application
import android.widget.Toast

//TODO firebase
//TODO ad

//TODO ad id manifest
//TODO leak canary
//TODO policy
//TODO rate app
//TODO share app
//TODO more app
//TODO proguard
//TODO keystore
//TODO splash screen

//done
//pkg name
//ic_launcher

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Toast.makeText(this, "onCreate $packageName", Toast.LENGTH_SHORT).show()
        }
    }
}
