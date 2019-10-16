package com.example.friends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnVladi(view: View){
        openActivityDescription3()
    }

    fun btnObama(view: View){
        openActivityDescription1()
    }

    fun btnClinton(view: View){
        openActivityDescription2()
    }

    fun btnTrump(view: View){
        openActivityDescription4()
    }

    fun openActivityDescription1(){
        val intent = Intent(this, Perfiles::class.java)
        startActivity(intent)
    }

    fun openActivityDescription2(){
        val intent = Intent(this, Perfiles2::class.java)
        startActivity(intent)
    }

    fun openActivityDescription3(){
        val intent = Intent (this, Perfiles3::class.java)
        startActivity(intent)
    }

    fun openActivityDescription4(){
        val intent = Intent(this, Perfiles4::class.java)
        startActivity(intent)
    }
}
