package com.example.usuario03

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.usuario03.databinding.Home04Binding
import com.google.android.material.bottomnavigation.BottomNavigationView

class home04 : AppCompatActivity() {


    lateinit var binding: Home04Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= Home04Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val casa : BottomNavigationView = findViewById(R.id.bottom_navigation)

        casa.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.btn_home -> {

                    replaceFragment(fragmentb())

                    true
                }
                R.id.btn_search -> {
                    // Acción para el item "Dashboard"
                    true
                }
                R.id.btn_profile -> {
                    // Acción para el item "Notifications"
                    true
                }
                else -> false
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {



        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.contenedor,fragment)
        fragmentTransaction.commit()

    }


}