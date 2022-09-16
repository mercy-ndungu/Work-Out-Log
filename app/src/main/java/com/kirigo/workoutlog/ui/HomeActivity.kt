package com.kirigo.workoutlog.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kirigo.workoutlog.R
import com.kirigo.workoutlog.databinding.ActivityHome2Binding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHome2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home2)
        binding = ActivityHome2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNav()
    }
    fun setupBottomNav() {
        binding.bnvBottom.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.plan -> {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvHome, PlanFragment())
                    transaction.commit()
                    true
                }
                R.id.track -> {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fcvHome, TrackFragment())
                    transaction.commit()
                    true
                }
                R.id.profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fcvHome, ProfileFragment()).commit()
                    true
                }
                else -> false
            }
        }
    }
}