package com.salti.project_kotlin_mobileapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.salti.project_kotlin_mobileapp.model.MovieActivity
import com.salti.project_kotlin_mobileapp.model.RecycleBuahActivity

class MainActivity : AppCompatActivity() {

    //untuk buat sebuah page/screen --> 1 activiy kotlin , 1 layout xml
    //untuk bisa widget nya kita pakai, kita harus declare widget id --> tidak boleh sama
    //deklarasi variable widget di activity kotlin
    //findview by id sesuai dengan id yang telah di declare di layout

    private  lateinit var  btnClick : Button
    private  lateinit var  txtWelcome : TextView
    private lateinit var  btnMenuPage2 : Button
    private lateinit var  btnLoginPage : Button
    private lateinit var  btnListView : Button
    private lateinit var  btnRecycle : Button
    private lateinit var  btnRecycleBuah : Button
    private lateinit var btnRcyMovie : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnClick = findViewById(R.id.btnClickHere)
        txtWelcome = findViewById(R.id.txtSelamatDatang)
        btnMenuPage2 = findViewById(R.id.btnMenuPage2)
        btnLoginPage = findViewById(R.id.btnHomePage1)
        btnListView = findViewById(R.id.btnListView)
        btnRecycle = findViewById(R.id.btnRecycle)
        btnRecycleBuah = findViewById(R.id.btnRecycleBuah)
        btnRcyMovie = findViewById(R.id.btnRcyMovie)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnClick.setOnClickListener(){
            Toast.makeText(this, "Anda klik button ini!", Toast.LENGTH_SHORT).show()

            txtWelcome.setText("Selamat Datang di Pemrograman Mobile Kotlin MI 2C")
        }

        btnMenuPage2.setOnClickListener(){
            //intent --> pindah dari satu activity ke activity lain
            //intent implicit : pindah yg ada project
            //intent expilicit : pindah keluar app dan manggil apps lain
            val intentMenu2 = Intent(this@MainActivity,
                Page2Activity::class.java)
            startActivity(intentMenu2)
        }

        btnRecycleBuah.setOnClickListener(){
            //intent --> pindah dari satu activity ke activity lain
            //intent implicit : pindah yg ada project
            //intent expilicit : pindah keluar app dan manggil apps lain
            val intentMenu2 = Intent(this@MainActivity,
                RecycleBuahActivity::class.java)
            startActivity(intentMenu2)
        }
        btnLoginPage.setOnClickListener(){
            //intent --> pindah dari satu activity ke activity lain
            //intent implicit : pindah yg ada project
            //intent expilicit : pindah keluar app dan manggil apps lain
            val intentMenu2 = Intent(this@MainActivity,
                LoginPageActivity::class.java)
            startActivity(intentMenu2)
        }

        btnListView.setOnClickListener(){
            //intent --> pindah dari satu activity ke activity lain
            //intent implicit : pindah yg ada project
            //intent expilicit : pindah keluar app dan manggil apps lain
            val intentMenu2 = Intent(this@MainActivity,
                ListView::class.java)
            startActivity(intentMenu2)
        }

        btnRecycle.setOnClickListener() {
            //intent --> pindah dari satu activity ke activity lain
            //intent implicit : pindah yg ada project
            //intent expilicit : pindah keluar app dan manggil apps lain
            val intentMenu2 = Intent(
                this@MainActivity,
                RecycleView::class.java
            )
            startActivity(intentMenu2)
        }

        btnRcyMovie.setOnClickListener(){
            //intent --> pindah dari satu activity ke activity lain
            //intent implicit : pindah yg ada project
            //intent expilicit : pindah keluar app dan manggil apps lain
            val intentMenu2 = Intent(this@MainActivity,
                MovieActivity::class.java)
            startActivity(intentMenu2)
        }
    }
}