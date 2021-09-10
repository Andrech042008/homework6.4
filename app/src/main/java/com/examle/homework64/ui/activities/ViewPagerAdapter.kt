package com.examle.homework64.ui.activities

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(val fragment: ArrayList<Fragment>, mainActivity: MainActivity) : FragmentStateAdapter(mainActivity){

    override fun getItemCount(): Int {
        return fragment.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragment[position]
    }


}
