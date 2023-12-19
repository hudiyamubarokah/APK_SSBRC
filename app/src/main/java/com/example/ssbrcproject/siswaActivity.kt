package com.example.ssbrcproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class siswaActivity : AppCompatActivity() {
    private lateinit var btn_tambah: ImageView
    private lateinit var btn_delete: ImageView
    private lateinit var btn_back: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_siswa)

        btn_tambah = findViewById(R.id.tambah)
        btn_delete = findViewById(R.id.delete)
        btn_back = findViewById(R.id.back)
        btn_back.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_tambah.setOnClickListener {
            val intent = Intent(this, frombioActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_delete.setOnClickListener {
            val intent = Intent(this, delsiswaActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}