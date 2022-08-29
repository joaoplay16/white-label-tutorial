package br.com.douglasmotta.whitelabeltutorial.domain.model

data class Product(
    val id: String = "",
    val description: String = "",
    val priceUrl: Double = 0.0,
    val imageUrl: String = ""
)