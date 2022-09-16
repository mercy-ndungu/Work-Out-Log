package com.kirigo.workoutlog.ui

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kirigo.workoutlog.R

class SplashActivity : AppCompatActivity() {
    lateinit var sharedRefs: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedRefs= getSharedPreferences("WORKOUTLOG_PREFS", MODE_PRIVATE)
        val accessToken = sharedRefs.getString("ACCESS_TOKEN", "")
        if (accessToken!!.isBlank()){
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }else{
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
        setContentView(R.layout.activity_main)

    }
}