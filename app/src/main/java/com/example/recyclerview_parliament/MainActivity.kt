package com.example.recyclerview_parliament

import ParliamentMembersData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview_parliament.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = MainAdapter(ParliamentMembersData.members)
        binding.listRv.adapter = adapter
    }


}