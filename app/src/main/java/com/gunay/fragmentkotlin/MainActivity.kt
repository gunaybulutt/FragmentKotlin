package com.gunay.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun firstFragment(View: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val firstFragment = BlankFragment()
        // direk üzerine ekler
        //fragmentTransaction.add(R.id.frameLayout,firstFragment).commit()
        // öncekini kaldırır öyle ekler
        fragmentTransaction.replace(R.id.frameLayout,firstFragment).commit()

    }

    fun secondFragment(View: View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val secondFragment = BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout,secondFragment).commit()
    }


}