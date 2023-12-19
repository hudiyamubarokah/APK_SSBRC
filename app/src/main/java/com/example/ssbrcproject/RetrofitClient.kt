package com.example.ssbrcproject

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "http://127.0.0.1:8000/" // Ganti sesuai URL Laravel Anda

    val KeuanganApiServis: KeuanganApiServis by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(KeuanganApiServis::class.java)
    }
}