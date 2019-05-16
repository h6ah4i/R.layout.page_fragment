package com.example.viewpager2badparcelableexception

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ExampleFragmentStateAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItem(position: Int): Fragment {
        return ExamplePagerFragment()
    }

    override fun getItemCount(): Int {
        return 5
    }
}
