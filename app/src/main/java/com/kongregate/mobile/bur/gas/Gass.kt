package com.kongregate.mobile.bur.gas

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.kongregate.mobile.bur.R
import com.kongregate.mobile.bur.databinding.ActivityGassBinding
import com.kongregate.mobile.bur.databinding.ActivityMainBinding
import com.kongregate.mobile.bur.was.Raka


class Gass : AppCompatActivity() {
    lateinit var bas:ActivityGassBinding
    lateinit var i:String
    var score=0
    var resul=0
    var scre="0"
    val rafa= mutableListOf<String>("q","w","e","r")
    val raf= mutableListOf<Int>(R.drawable.imagina1,R.drawable.imagina2,R.drawable.imagina3,R.drawable.imagina4,R.drawable.imagina5)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bas = ActivityGassBinding.inflate(layoutInflater)
        setContentView(bas.root)
        bas.imaga1.setOnClickListener{
            score++
            bas.imaga1.setVisibility(View.GONE)
            resul++
            bas.resul.text="Score : $resul"
        }
        bas.resu.setOnClickListener {
            bas.resu.setVisibility(View.GONE)
            resul=0
            score=0
            bas.resul.text="Score : $resul"
            i=rafa.random()
            chas()
        }




    }


    fun anara(){
        bas.imaga1.animate().apply {
            bas.imaga1.setVisibility(View.VISIBLE)
            duration=1999
            translationX(200f)
            translationY(800f)
        }.withEndAction {
            bas.imaga1.animate().apply {
                bas.imaga1.setVisibility(View.GONE)
                duration=1
                translationY(0f)
                translationX(0f)
            }.withEndAction {
                score--
                if(score==0){
                    i=rafa.random()
                    chas()
                }
                else if(score==-1){
                    bas.resu.setVisibility(View.VISIBLE)
                    scre="Your score : $resul"
                    val intent= Intent(this@Gass, Raka::class.java)
                    intent.putExtra("jara",scre)
                    startActivity(intent)

                }

            }
        }
    }
    fun anara2(){
        bas.imaga1.animate().apply {
            bas.imaga1.setVisibility(View.VISIBLE)
            duration=1999
            translationX(-200f)
            translationY(800f)
        }.withEndAction {
            bas.imaga1.animate().apply {
                bas.imaga1.setVisibility(View.GONE)
                duration=1
                translationY(0f)
                translationX(0f)
            }.withEndAction {
                score--
                if(score==0){
                    i=rafa.random()
                    chas()
                }
                else if(score==-1){
                    bas.resu.setVisibility(View.VISIBLE)
                    scre="Your score : $resul"
                    val intent= Intent(this@Gass, Raka::class.java)
                    intent.putExtra("jara",scre)
                    startActivity(intent)

                }

            }
        }
    }
    fun anara3(){
        bas.imaga1.animate().apply {
            bas.imaga1.setVisibility(View.VISIBLE)
            duration=1999
            translationX(200f)
            translationY(-800f)
        }.withEndAction {
            bas.imaga1.animate().apply {
                bas.imaga1.setVisibility(View.GONE)
                duration=1
                translationY(0f)
                translationX(0f)
            }.withEndAction {
                score--
                if(score==0){
                    i=rafa.random()
                    chas()
                }
                else if(score==-1){
                    bas.resu.setVisibility(View.VISIBLE)
                    scre="Your score : $resul"
                    val intent= Intent(this@Gass, Raka::class.java)
                    intent.putExtra("jara",scre)
                    startActivity(intent)


                }

            }
        }
    }
    fun anara4(){
        bas.imaga1.animate().apply {
            bas.imaga1.setVisibility(View.VISIBLE)
            duration=1999
            translationX(-200f)
            translationY(-800f)
        }.withEndAction {
            bas.imaga1.animate().apply {
                bas.imaga1.setVisibility(View.GONE)
                duration=1
                translationY(0f)
                translationX(0f)
            }.withEndAction {
                score--
                if(score==0){
                    i=rafa.random()
                    chas()
                }
                else if(score==-1){
                    bas.resu.setVisibility(View.VISIBLE)
                    scre="Your score : $resul"
                    val intent= Intent(this@Gass, Raka::class.java)
                    intent.putExtra("jara",scre)
                    startActivity(intent)


                }

            }
        }
    }

    private fun chas(){
        if(i=="q"){
            anara()
            bas.imaga1.setBackgroundResource(raf.random())
        }
        else if(i=="w"){
            anara2()
            bas.imaga1.setBackgroundResource(raf.random())
        }
        else if(i=="e"){
            anara3()
            bas.imaga1.setBackgroundResource(raf.random())
        }
        else if(i=="r"){
            anara4()
            bas.imaga1.setBackgroundResource(raf.random())
        }
    }
}