package com.example.e1mdmelomiguel8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.e1mdmelomiguel8.databinding.ActivityAutorBinding
import com.example.e1mdmelomiguel8.databinding.ActivityMainBinding
import com.bumptech.glide.Glide as Glide

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this)
            .load("https://todomaquetas.es/3696-large_default/solido-1803404-porsche-911-964-turbo-36-black-1993-escala-118.jpg")
            .into(binding.imageView);
        binding.btnAutor.setOnClickListener{
            startActivity(Intent(this, Autor::class.java))
        }
        binding.btnContinuar.setOnClickListener{
            startActivity(Intent(this, Login::class.java))




        }
    }
}