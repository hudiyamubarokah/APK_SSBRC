package com.example.ssbrcproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class hhm: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menunggu beberapa detik (misalnya, 3 detik) sebelum berpindah ke activity utama
        val splashTimeOut: Long = 3000
        val mainIntent = Intent(this, MainActivity::class.java)

        // Delay untuk splash screen
        Thread {
            try {
                Thread.sleep(splashTimeOut)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            } finally {
                startActivity(mainIntent)
                finish()
            }
        }.start()
    }
}