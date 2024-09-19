package com.salti.project_kotlin_mobileapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.salti.project_kotlin_mobileapp.adapter.BukuAdapter
import com.salti.project_kotlin_mobileapp.model.ModelBuku

private lateinit var rev_data : RecyclerView
class RecycleView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)

        rev_data = findViewById(R.id.rv_data)

        //kita array list
        val listBuku = listOf(
            ModelBuku(judul = "Cantik Itu Luka", penulis = "Eka Kurniawan"),
            ModelBuku(judul = "Laut Bercerita", penulis = "Leila S. Chudori"),
            ModelBuku(judul = "Laskar Pelangi", penulis = "Andrea Hirata "),
            ModelBuku(judul = "Perjalanan Menuju Pulang ", penulis = "Lala Bohang, Lala Noberg"),
            ModelBuku(judul = "Bumi Manusia", penulis = "Pramoedya Ananta Toer"),
            ModelBuku(judul = "Bumi", penulis = "Tere Liye"),
            ModelBuku(judul = "Hujan", penulis = "Tere Liye"),

            )

        //baru kita set adapter
        val nBukuAdapter = BukuAdapter(listBuku)
        rev_data.apply {
            layoutManager = LinearLayoutManager(this@RecycleView)
            adapter = nBukuAdapter
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}