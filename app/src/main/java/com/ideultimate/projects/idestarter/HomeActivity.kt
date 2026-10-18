package com.ideultimate.projects.idestarter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Kotlin Android Activity linked to layout: res/layout/activity_home.xml
 */
class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}