package com.roy.calculator

import android.app.Application
import android.widget.Toast

//TODO firebase
//TODO ad

//TODO keystore
//TODO splash screen

//done
//pkg name
//ic_launcher
//ad id manifest
//leak canary
//proguard
//policy
//rate app
//share app
//more app
//github
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Toast.makeText(this, "onCreate $packageName", Toast.LENGTH_SHORT).show()
        }
    }
}
