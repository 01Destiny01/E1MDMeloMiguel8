package com.example.e1mdmelomiguel8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e1mdmelomiguel8.databinding.ActivityAutorBinding
import com.example.e1mdmelomiguel8.databinding.ActivityMainBinding

class Autor : AppCompatActivity() {
    private lateinit var  binding : ActivityAutorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAutorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.volverAmain.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))


        }



    }
}