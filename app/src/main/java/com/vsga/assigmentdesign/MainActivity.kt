package com.vsga.assigmentdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import com.vsga.assigmentdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // inflate layout
        setContentView(binding.root) // set layout


        binding.btnMasuk.setOnClickListener {

            val username = binding.edtUsername.text.toString()
            val password = binding.edtPassword.text.toString()

            if (username.isEmpty()) {
                binding.edtUsername.error = "Username tidak boleh kosong"
                binding.edtUsername.requestFocus()
                return@setOnClickListener
            } else if (password.isEmpty()) {
                binding.edtPassword.error = "Password tidak boleh kosong"
                binding.edtPassword.requestFocus()
                return@setOnClickListener
            } else if (username.equals("admin",true) && password == "admin123") {
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
            } else {
                binding.edtUsername.error = "Username atau password salah"
                binding.edtUsername.requestFocus()
                return@setOnClickListener
            }
        }

        binding.tvDaftar.setOnClickListener {
            val intent = Intent(this, RegistrasiActivity::class.java)
            startActivity(intent)
        }
    }

}