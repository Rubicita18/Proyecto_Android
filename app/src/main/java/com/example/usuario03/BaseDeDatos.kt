package com.example.usuario03

data class Producto(
    val id: Int,
    val nombre: String,
    val imagen: String,
    val descripcion: String,
    val precio: Double,
    val video: String
)

data class Categoria(
    val nombre: String,
    val productos: List<Producto>
)

object BaseDeDatos {
    val categorias = listOf(
        Categoria(
            nombre = "Laptops",
            productos = listOf(
                Producto(
                    id = 1,
                    nombre = "Laptop Gamer XYZ",
                    imagen = "/drawable/imagen1_slider.jpg",
                    descripcion = "Laptop potente con gráficos de última generación.",
                    precio = 1200.0,
                    video = "https://example.com/videos/laptop_gamer_xyz_video"
                ),
                Producto(
                    id = 2,
                    nombre = "Laptop Ultrabook ABC",
                    imagen = "/drawable/imagen2_slider.jpg",
                    descripcion = "Ultrabook liviano y elegante con batería de larga duración.",
                    precio = 900.0,
                    video = "https://example.com/videos/laptop_ultrabook_abc_video"
                )
            )
        ),
        Categoria(
            nombre = "Smartphones",
            productos = listOf(
                Producto(
                    id = 3,
                    nombre = "Smartphone Ultra",
                    imagen = "https://example.com/imagenes/smartphone_ultra.webp",
                    descripcion = "Smartphone con cámara de alta resolución y pantalla AMOLED.",
                    precio = 800.0,
                    video = "https://example.com/videos/smartphone_ultra_video"
                ),
                Producto(
                    id = 4,
                    nombre = "Smartphone Pro",
                    imagen = "https://example.com/imagenes/smartphone_pro.webp",
                    descripcion = "Smartphone con rendimiento excepcional y batería de larga duración.",
                    precio = 700.0,
                    video = "https://example.com/videos/smartphone_pro_video"
                )
            )
        )
    )
}