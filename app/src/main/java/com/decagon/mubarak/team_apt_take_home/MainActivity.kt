package com.decagon.mubarak.team_apt_take_home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.decagon.mubarak.team_apt_take_home.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navigation = findNavController(R.id.fragmentContainerView)
        val bottomNav = binding.bottomNav
        NavigationUI.setupWithNavController(bottomNav, navigation)
    }
}
