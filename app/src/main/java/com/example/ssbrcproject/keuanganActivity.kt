package com.example.ssbrcproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class keuanganActivity : AppCompatActivity() {

    private lateinit var btn_tambah:ImageView
    private lateinit var btn_back: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_keu)

        btn_tambah = findViewById(R.id.tambah)

        btn_tambah.setOnClickListener {
            val intent = Intent(this, kefromActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_back = findViewById(R.id.back)
        btn_back.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        // Contoh penggunaan untuk GET data keuangan
        val rvKeuangan = findViewById<RecyclerView>(R.id.listdatakeu)

        // Ganti getService() dengan metode yang sesuai dengan API keuangan Anda
        APIConfigkeu.getService().getKeuangan().enqueue(object : Callback<List<Keuangan>> {
            override fun onResponse(call: Call<List<Keuangan>>, response: Response<List<Keuangan>>) {
                if (response.isSuccessful) {
                    val dataKeuangan = response.body()
                    val keuanganAdapter = KeuanganAdapter(dataKeuangan)
                    rvKeuangan.apply {
                        layoutManager = LinearLayoutManager(this@keuanganActivity)
                        setHasFixedSize(true)
                        keuanganAdapter.notifyDataSetChanged()
                        adapter = keuanganAdapter
                    }
                }
            }

            override fun onFailure(call: Call<List<Keuangan>>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })
    }

//    private lateinit var btn_keu:androidx.cardview.widget.CardView
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.keuangan)
//        btn_keu = findViewById(R.id.keuanganlist)
//
//        btn_keu.setOnClickListener {
//            val intent = Intent(this, listkeuActivity::class.java)
//            startActivity(intent)
//            finish()
//        }

//    }
}