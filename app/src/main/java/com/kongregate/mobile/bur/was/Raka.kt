package com.kongregate.mobile.bur.was

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kongregate.mobile.bur.R
import com.kongregate.mobile.bur.databinding.ActivityRakaBinding
import com.kongregate.mobile.bur.gas.Gass
import com.kongregate.mobile.bur.mas.Rass

class Raka : AppCompatActivity() {
    lateinit var bar:ActivityRakaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bar= ActivityRakaBinding.inflate(layoutInflater)
        setContentView(bar.root)
        bar.resulas.text= getIntent().getStringExtra("jara")
        bar.rules.setOnClickListener {
            val intent= Intent(this@Raka, Rass::class.java)
            startActivity(intent)
        }
        bar.startVertical.setOnClickListener {
            val intent= Intent(this@Raka, Gass::class.java)
            startActivity(intent)
        }
    }
}