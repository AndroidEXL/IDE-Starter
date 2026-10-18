package com.ideultimate.projects.idestarter

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // On activity create
        setContentView(R.layout.activity_main)
        initializeLogic()
    }

    private fun initializeLogic() {
        // Initialize logic here

        // Event: textview1: onTextClick
        findViewById<TextView>(R.id.textview1).setOnClickListener {
            val text = (it as TextView).text.toString()
        
        }
    }
}
