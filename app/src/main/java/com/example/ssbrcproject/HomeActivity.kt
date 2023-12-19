package com.example.ssbrcproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    private lateinit var btn_keuangan:androidx.cardview.widget.CardView
    private lateinit var btn_siswa:androidx.cardview.widget.CardView
    private lateinit var btn_berita:androidx.cardview.widget.CardView
    private lateinit var btn_profile:androidx.cardview.widget.CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        btn_keuangan = findViewById(R.id.keuanganMenu)
        btn_siswa = findViewById(R.id.SiswaMenu)
        btn_berita= findViewById(R.id.beritaMenu)
        btn_profile = findViewById(R.id.profileMenu)

        btn_keuangan.setOnClickListener {
            val intent = Intent(this, keuanganActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_siswa.setOnClickListener {
            val intent = Intent(this, siswaActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_berita.setOnClickListener {
            val intent = Intent(this, beritaActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_profile.setOnClickListener {
            val intent = Intent(this, profileActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}