package com.kirigo.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import com.kirigo.workoutlog.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
  lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.tvSignup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            validation()
        }

    }
    fun validation(){
        var email = binding.etEmail.text.toString()
        var password = binding.etPassword.text.toString()
        var error = false
        if(email.isBlank()){
            binding.tilEmail.error = "Email is required"
            error= true
        }
        if(password.isBlank()){
           binding.tilPassword.error = "Password is required"
            error= true
        }
        if(!error){
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}
