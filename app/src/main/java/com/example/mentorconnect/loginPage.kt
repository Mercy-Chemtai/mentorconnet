package com.example.mentorconnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mentorconnect.databinding.ActivityLoginPageBinding
import com.example.mentorconnect.databinding.ActivityMainBinding

class loginPage : AppCompatActivity() {
    lateinit var binding : ActivityLoginPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txsignup.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnlogin.setOnClickListener {
            validateRegistration()
        }

//        setContentView(R.layout.activity_login_page)
//        val txsignup= findViewById<TextView>(R.id.txsignup)
//
//        txsignup.setOnClickListener ({
//            val intent = Intent(this,MainActivity::class.java)
//            startActivity(intent)
//        })
    }
  fun  validateRegistration() {
      clearError()
      var formError = false
      val userName = binding.etUserName.text.toString()
      if (userName.isBlank()) {
          formError = true
          binding.etUserName.error = "username is required"
      }

      val password = binding.etpassword.text.toString()
      if (password.isBlank()) {
          formError = true
          binding.etpassword.error = "password is required"
      }
  }
    fun clearError(){
        binding.etUserName.error = null
        binding.etpassword.error = null
    }

    }




