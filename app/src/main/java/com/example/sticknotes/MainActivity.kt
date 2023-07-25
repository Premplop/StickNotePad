package com.example.sticknotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.sticknotes.databinding.ActivityMainBinding
import com.example.sticknotes.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel : MainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.addNotes.setOnClickListener{
            viewModel.add()
        }
    }


}