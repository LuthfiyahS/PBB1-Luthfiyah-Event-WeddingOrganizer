package com.uts201904024.uts201904024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val btn = findViewById<Button>(R.id.View)
        val txtsam = findViewById<TextView>(R.id.txtWel)
        val txtsam2 = findViewById<TextView>(R.id.txtWel2)
        val txtT = "Hai, Selamat Datang "+intent.getStringExtra("usrnm")+"!"
        val txtT2 = "Lengkapi Hari Bahagiamu Bersama Kami"
        val btndtl = findViewById<Button>(R.id.btn1)
        val btndtl1 = findViewById<Button>(R.id.btn2)
        txtsam.text = txtT
        txtsam2.text = txtT2

        btn.setOnClickListener {
            val move = Intent(this@Dashboard,CardView::class.java)
            startActivity(move)
        }

        btndtl.setOnClickListener {
            val move = Intent(this@Dashboard,Detail1::class.java)
            startActivity(move)
        }
        btndtl1.setOnClickListener {
            val move = Intent(this@Dashboard,Detail2::class.java)
            startActivity(move)
        }
    }
}