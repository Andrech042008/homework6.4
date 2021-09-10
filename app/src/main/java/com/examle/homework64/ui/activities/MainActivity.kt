package com.examle.homework64.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.examle.homework64.R
import com.examle.homework64.databinding.ActivityMainBinding
import com.examle.homework64.ui.fragments.FirstFragment
import com.examle.homework64.ui.fragments.SecondFragment
import com.examle.homework64.ui.fragments.ThirdFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragment: ArrayList<Fragment> = arrayListOf(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment()
        )

        val adapter = ViewPagerAdapter(fragment, this)
        binding.viewPage2.adapter = adapter
    }
}