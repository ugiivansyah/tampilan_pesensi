package com.example.tampilanpesensi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class activity_tampilan1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan1)

        fun sendMessage (view: View){
            val textView = findViewById<TextView>(R.id.textView)
            val message = textView.text.toString()
            val intent = Intent(this, activity_tampilan1::class.java).
            apply {  putExtra(EXTRA_MESSAGE, message) }

            startActivity(intent)
        }
    }
}