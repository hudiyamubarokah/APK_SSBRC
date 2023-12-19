package com.example.ssbrcproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KeuanganAdapter(val dataKeuangan: List<Keuangan>?) : RecyclerView.Adapter<KeuanganAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val description = view.findViewById<TextView>(R.id.description)
        val saldo = view.findViewById<TextView>(R.id.saldo)
        val type = view.findViewById<TextView>(R.id.type)
        val tglTransaksi = view.findViewById<TextView>(R.id.tgl_transaksi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.listtambahkeuangan, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataKeuangan?.size ?: 0
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val keuangan = dataKeuangan?.get(position)

        holder.description.text = keuangan?.description
        holder.saldo.text = " Rp. ${keuangan?.saldo}"
        holder.type.text = keuangan?.type
        holder.tglTransaksi.text = keuangan?.tgl_transaksi
    }
}