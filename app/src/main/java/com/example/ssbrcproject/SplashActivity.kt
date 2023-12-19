package com.example.ssbrcproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        // Menunggu beberapa detik (misalnya, 3 detik) sebelum berpindah ke activity utama
        val splashTimeOut: Long = 3000
        val mainIntent = Intent(this, LoginActivity::class.java)

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