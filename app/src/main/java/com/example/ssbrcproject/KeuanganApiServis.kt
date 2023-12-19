package com.example.ssbrcproject

import retrofit2.Call
import retrofit2.http.*

interface KeuanganApiServis {
    @GET("/keuangan")
    fun getKeuangan(): Call<List<Keuangan>>

//    @GET("/keuangan/{id}")
//    fun getKeuanganById(@Path("id") id: Int): Call<Keuangan>

    @POST("/keuangan")
    fun postKeuangan(@Body keuangan: Keuangan): Call<Keuangan>
//
//    @DELETE("/keuangan/{id}")
//    fun deleteKeuangan(@Path("id") id: Int): Call<Void>
}