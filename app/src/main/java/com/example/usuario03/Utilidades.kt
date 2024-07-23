package com.example.usuario03

class Utilidades {

    fun obtenerProductosDeCadaCategoria(): List<Producto> {
        return BaseDeDatos.categorias.mapNotNull { categoria ->
            categoria.productos.firstOrNull()
        }
    }

}