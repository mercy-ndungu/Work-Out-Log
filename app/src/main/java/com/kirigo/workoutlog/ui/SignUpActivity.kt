package com.kirigo.workoutlog.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kirigo.workoutlog.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding


    //    tvLogin2.setOnClickListener {
//        val intent = Intent(this, LoginActivity::class.java)
//        startActivity(intent)
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvLogin2.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignUp.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignUp.setOnClickListener {
            validity()
        }
    }

    fun validity() {
        var password1 = binding.etEnterPassword.text.toString()
        var password2 = binding.etConfirmPassword.text.toString()
        if (password1 != password2) {
            binding.tilConfirmPassword.error = "Password does not match!"
        }
//
////        fun validation(){
////            var email = etEmail.text.toString()
////            var password = etPassword.text.toString()
////            if(email.isBlank()){
////                tilEmail.error = "Email is required"
////            }eye
////            if(password.isBlank()){
////                tilPassword.error = "Password is required"
////            }
////        }
////    }
//    }
    }
}