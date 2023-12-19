package com.example.ssbrcproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.ssbrcproject.API.ApiService
import com.example.ssbrcproject.modal.loginResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class LoginActivity : AppCompatActivity() {
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        buttonLogin.setOnClickListener {

            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            if (email == "example@mail.com" && password == "password") {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
            }
        }

    }
//    private lateinit var editTextEmail: EditText
//    private lateinit var editTextPassword: EditText
//    private lateinit var buttonLogin: Button
//    private lateinit var apiService: ApiService
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.login)
//
//        editTextEmail = findViewById(R.id.editTextEmail)
//        editTextPassword = findViewById(R.id.editTextPassword)
//        buttonLogin = findViewById(R.id.buttonLogin)
//
//        val retrofit = Retrofit.Builder()
//            .baseUrl("https://example.com/api/") // Ganti dengan URL base API Anda
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//
//        apiService = retrofit.create(ApiService::class.java)
//
//        buttonLogin.setOnClickListener {
//            handleLogin()
//        }
//    }
//
//    private fun handleLogin() {
//        val email = editTextEmail.text.toString()
//        val password = editTextPassword.text.toString()
//
//        val call = apiService.login(email, password)
//
//        call.enqueue(object : Callback<loginResponse> {
//            override fun onResponse(call: Call<loginResponse>, response: Response<loginResponse>) {
//                if (response.isSuccessful) {
//                    val loginResponse = response.body()
//                    showToast("Login successful. Welcome, ${loginResponse?.name}!")
//                    navigateToMainActivity()
//                    finish()
//                } else {
//                    showToast("Login failed. Invalid credentials.")
//                }
//            }
//
//            override fun onFailure(call: Call<loginResponse>, t: Throwable) {
//                showToast("Network error. Please try again.")
//            }
//        })
//    }
//
//    private fun navigateToMainActivity() {
//        val intent = Intent(this, HomeActivity::class.java)
//        startActivity(intent)
//    }
//
//    private fun showToast(message: String) {
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//    }


}

