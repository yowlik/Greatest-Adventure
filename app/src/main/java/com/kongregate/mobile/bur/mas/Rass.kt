package com.kongregate.mobile.bur.mas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kongregate.mobile.bur.R
import com.kongregate.mobile.bur.databinding.ActivityRassBinding
import com.kongregate.mobile.bur.gas.Gass

class Rass : AppCompatActivity() {
    lateinit var bind:ActivityRassBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind= ActivityRassBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.startVertical.setOnClickListener {
            val intent1= Intent(this@Rass, Gass::class.java)
            startActivity(intent1)
        }
    }
}