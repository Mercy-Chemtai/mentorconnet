package com.example.mentorconnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mentorconnect.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txlogin.setOnClickListener {
            val intent = Intent(this,loginPage ::class.java)
            startActivity(intent)


        binding.btnRegister.setOnClickListener {
            validateRegistration() }
        }

    }
    fun  validateRegistration(){
        clearError()
        var formError = false
        val firstName = binding.etfirstname.text.toString()
        if(firstName.isBlank()){
            formError = true
            binding .etfirstname.error = getString(R.string.firstName_is_required)
        }

        val lastname= binding.etlastname.text.toString()
        if(lastname.isBlank()){
            formError = true
            binding .etlastname.error = getString(R.string.lastName_is_required)
        }
        val codehaveId= binding.etCodeHiveId.text.toString()
        if(codehaveId.isBlank()){
            formError = true
            binding .etCodeHiveId.error = getString(R.string.codeHaveid_is_required)
        }
        val email= binding.etEmail.text.toString()
        if(email.isBlank()){
            formError = true
            binding.etEmail.error = "email_is_required"
        }
        val userName= binding.etfirstname.text.toString()
        if(userName.isBlank()){
            formError = true
            binding .etUserName.error = "username_is_required"
        }
        val password= binding.etPassword.text.toString()
        if(password.isBlank()){
            formError = true
            binding .etPassword.error = "password_is_required"
        }
        val passwordconf= binding.etConfirmedPassword.text.toString()
        if(passwordconf.isBlank()){
            formError = true
            binding .etConfirmedPassword.error = "confirm_password_is_required"
        }
        if(!formError){
          val  registration = Registration(
              firstName = firstName,
              lastName = lastname,
              codehiveId = codehaveId,
              Username = userName,
              password = password,
          )

   }
    }
//
    fun clearError(){
        binding.tilfistname.error = null
        binding.tilLastName.error = null
        binding.tilCodeHiveId.error = null
        binding.tilEmail.error = null
        binding.tilUsername.error = null
        binding.tilPassword.error = null
        binding.tilConfirmPassword.error = null
    }

}
