package com.example.firebasecrud

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    @JvmField
    var namaBarang: TextView

    @JvmField
    var merkBarang: TextView

    @JvmField
    var hargaBarang: TextView

    @JvmField
    var view: CardView

    init {
        namaBarang = itemView.findViewById(R.id.nama_item_barang)
        merkBarang = itemView.findViewById(R.id.merk_item_barang)
        hargaBarang = itemView.findViewById(R.id.harga_item_barang)
        view = itemView.findViewById(R.id.cv_main)
    }
}