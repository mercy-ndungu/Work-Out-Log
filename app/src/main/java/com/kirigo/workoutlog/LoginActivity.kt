package com.kirigo.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var tilEmail: TextInputLayout
    lateinit var etEmail: EditText
    lateinit var tilPassword: TextInputLayout
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    lateinit var tvSignup: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin = findViewById(R.id.btnLogin)
        tilEmail = findViewById(R.id.tilEmail)
        etEmail = findViewById(R.id.etEmail)
        tilPassword = findViewById(R.id.tilPassword)
        tvSignup = findViewById(R.id.tvSignup)
        etPassword = findViewById(R.id.etPassword)


        tvSignup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener {
            validation()
        }

    }
    fun validation(){
        var email = etEmail.text.toString()
        var password = etPassword.text.toString()
        var error = false
        if(email.isBlank()){
            tilEmail.error = "Email is required"
            error= true
        }
        if(password.isBlank()){
            tilPassword.error = "Password is required"
            error= true
        }
        if(!error){
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}
