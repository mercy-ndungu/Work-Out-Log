package com.kirigo.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class SignUpActivity : AppCompatActivity() {
    lateinit var etEnterPassword: EditText
    lateinit var etConfirmPassword: EditText
    lateinit var btnSignUp: Button
    lateinit var tvLogin2: TextView
    lateinit var tilConfirmPassword: TextInputLayout


//    tvLogin2.setOnClickListener {
//        val intent = Intent(this, LoginActivity::class.java)
//        startActivity(intent)
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    btnSignUp = findViewById(R.id.btnSignUp)
    etConfirmPassword = findViewById(R.id.etConfirmPassword)
    tvLogin2 = findViewById(R.id.tvLogin2)
    etEnterPassword = findViewById(R.id.etEnterPassword)
    tilConfirmPassword = findViewById(R.id.tilConfirmPassword)


    tvLogin2.setOnClickListener {
       val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
   }
    btnSignUp.setOnClickListener {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
    btnSignUp.setOnClickListener {
        validity()
    }
    }
    fun validity(){
        var password1 = etEnterPassword.text.toString()
        var password2 = etConfirmPassword.text.toString()
        if(password1!=password2){
            tilConfirmPassword.error = "Password does not match!"
        }

//        fun validation(){
//            var email = etEmail.text.toString()
//            var password = etPassword.text.toString()
//            if(email.isBlank()){
//                tilEmail.error = "Email is required"
//            }
//            if(password.isBlank()){
//                tilPassword.error = "Password is required"
//            }
//        }
//    }
    }
}