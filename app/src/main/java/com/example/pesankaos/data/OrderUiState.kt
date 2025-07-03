package com.example.pesankaos.data

data class OrderUiState(
    val quantity: Int = 0,
    val color: String = "",
    val date: String = "",
    val price: String = "",
    val pickupOptions: List<String> = listOf()
)