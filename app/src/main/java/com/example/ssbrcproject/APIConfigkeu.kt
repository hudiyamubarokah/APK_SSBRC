package com.example.ssbrcproject

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIConfigkeu {
    const val baseURL = "http://192.168.103.48/"

    // Menambahkan Interceptor untuk menambahkan header Authorization jika diperlukan


    fun getRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getService(): KeuanganApiServis {
        return getRetrofit().create(KeuanganApiServis::class.java)
    }
}