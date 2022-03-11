package com.example.sement_shop_mangement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        setFullScreen(window)
        lightStatusBar(window)

        button_create_data_penjualan.setOnClickListener {
            startActivity(Intent(this, CreateDataPenjualanActivity::class.java))
        }

        button_create_data_pengeluaran.setOnClickListener {
            startActivity(Intent(this, CreateDataPengeluaranActivity::class.java))
        }

    }
}