package com.example.feedback1

data class Novela(
    val titulo: String,
    val autor: String,
    val anoPublicacion: Int,
    val sinopsis: String,
    var esFavorita: Boolean = false,
    val reseñas: MutableList<String> = mutableListOf()
)

