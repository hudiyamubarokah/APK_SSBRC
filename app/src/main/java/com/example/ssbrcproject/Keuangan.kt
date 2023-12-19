package com.example.ssbrcproject

data class Keuangan(
    val id: Int,
    val description: String,
    val saldo: Double,
    val type: String,
    val tgl_transaksi: String
)
