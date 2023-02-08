package fr.openium.mastertp1_2.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import fr.openium.mastertp1_2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","OnCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}