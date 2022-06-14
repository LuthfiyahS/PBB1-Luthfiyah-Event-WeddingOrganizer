package com.uts201904024.uts201904024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = findViewById<EditText>(R.id.txtUser)
        val pass = findViewById<EditText>(R.id.txtPass)
        val button = findViewById<Button>(R.id.btnlogin)

        button.setOnClickListener {
            if (user.text.toString() == "Luthfiyah S" && pass.text.toString() == "12121212"){
                Toast.makeText(this@MainActivity, "Login Successful", Toast.LENGTH_SHORT).show()
                val move = Intent(this@MainActivity,Dashboard::class.java)
                move.putExtra("usrnm", user.text.toString())
                startActivity(move)
            }
        else{
                val builder: AlertDialog.Builder = AlertDialog.Builder(this@MainActivity)
                builder.setMessage("Username or Password is Wrong!")
                    .setNegativeButton("Retry",
                        null).create().show()
            }
        }
    }
}