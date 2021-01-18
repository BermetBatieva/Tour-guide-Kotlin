package com.example.tourguide

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class CategoryAdapter (val context: Context, val fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int) : Fragment {
        when (position) {
            0 -> return ParksFragment()
            1 -> return ShopFragment()
            2 -> return RestaurantFragment()
            3 -> return CultureFragment()
        }
        return Fragment()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return context.getString(R.string.parks)
            1 -> return context.getString(R.string.shop)
            2 -> return context.getString(R.string.restaurants)
            3 -> return context.getString(R.string.culture)
        }
        return null
    }
}