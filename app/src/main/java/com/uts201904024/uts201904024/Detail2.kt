package com.uts201904024.uts201904024

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Detail2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)
        val btnCall: Button = findViewById(R.id.btnbuy)

        btnCall.setOnClickListener{
            val phone = "081315727567"
            var intentPhone = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phone"))
            startActivity(intentPhone)
        }
    }
}