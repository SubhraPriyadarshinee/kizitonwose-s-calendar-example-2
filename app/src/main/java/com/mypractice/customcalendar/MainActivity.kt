package com.mypractice.customcalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mypractice.customcalendar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    internal lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}