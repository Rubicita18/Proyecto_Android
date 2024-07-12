package com.example.usuario03


import com.example.usuario03.ImageAdapter
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2

class Slider : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var imageAdapter: ImageAdapter
    private val handler = Handler(Looper.getMainLooper())
    private val images = listOf(
        R.drawable.imagen1_slider,
        R.drawable.imagen2_slider,
        R.drawable.imagen1_slider
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_slider)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Inicializar el viewPager y el adapter
        viewPager = findViewById(R.id.viewPager2)
        imageAdapter = ImageAdapter(images)
        viewPager.adapter = imageAdapter

        // Iniciar el auto-scroll
        startAutoScroll()

    }
    // Método para iniciar el auto-scroll
    private fun startAutoScroll() {
        val runnable = object : Runnable {
            var currentPage = 0
            override fun run() {
                if (currentPage == imageAdapter.itemCount) {
                    currentPage = 0
                }
                viewPager.setCurrentItem(currentPage++, true)
                handler.postDelayed(this, 3000) // Cambia de imagen cada 3 segundos
            }
        }
        handler.post(runnable)
    }

    // Método onDestroy, donde se eliminan los callbacks
    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }
}