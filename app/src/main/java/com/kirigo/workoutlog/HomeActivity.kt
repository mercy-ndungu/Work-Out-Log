package com.kirigo.workoutlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kirigo.workoutlog.databinding.ActivityHome2Binding
import com.kirigo.workoutlog.databinding.ActivityHomeBinding
import com.kirigo.workoutlog.databinding.ActivitySignUpBinding

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