package edu.uw.ischool.nivlac.activityspy

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val tag: String = "Activity Spy"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.i(tag, "onCreate event fired");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "onDestroy event fired");
        Log.e(tag, "We're going down, Captain!")
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "onStop event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "onPause event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume event fired")
    }
}