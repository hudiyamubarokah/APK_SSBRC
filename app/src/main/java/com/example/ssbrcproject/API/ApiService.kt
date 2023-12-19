package com.example.ssbrcproject.API


import com.example.ssbrcproject.modal.loginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded


interface ApiService {
    @FormUrlEncoded
    @POST("login") // Ganti dengan path endpoint login yang sesuai
    fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<loginResponse>
}