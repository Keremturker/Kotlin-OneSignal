package com.keremturker.kotlin_onesignal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.onesignal.OneSignal

class MainActivity : AppCompatActivity() {

    private val ONESIGNAL_APP_ID = "000b9068-53f6-4210-bc50-ce65b7835c63"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE,OneSignal.LOG_LEVEL.NONE)

        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}