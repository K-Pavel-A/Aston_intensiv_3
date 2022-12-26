package ru.aston.astonintensiv3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.aston.astonintensiv3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.task1Button.setOnClickListener {
            val intent = Intent(this, Task1Activity::class.java )
            startActivity(intent)
        }

        binding.task2Button.setOnClickListener {
            val intent = Intent(this, Task2Activity::class.java )
            startActivity(intent)
        }

    }
}