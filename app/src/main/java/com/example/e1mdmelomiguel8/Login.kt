package com.example.e1mdmelomiguel8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e1mdmelomiguel8.databinding.ActivityLoginBinding
import com.example.e1mdmelomiguel8.databinding.ActivityMainBinding

class Login : AppCompatActivity() {
    private lateinit var  binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun comprobarUsuario(){
            val posUsu = 0;
            var usuarios: MutableList<Usuario> = mutableListOf(
                Usuario(
                    "miguel", "miguel"
                ))



        }
    }
}