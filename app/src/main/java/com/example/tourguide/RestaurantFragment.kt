package com.example.tourguide


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RestaurantFragment : Fragment() {
    private var linearLayoutManager: LinearLayoutManager? = null
    var adapter: LocationAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.location_list, container, false)

        val location = ArrayList<Location>()
        location.add(
            Location(
                "Первый Сырный ресторан", R.drawable.ressyr, getString(R.string.syr),getString(R.string.addresssyr),
                getString(R.string.phonesyr),"42.842509, 74.621175"
            )
        )
        location.add(
            Location(
                "Нават", R.drawable.resnavat, getString(R.string.navat), getString(R.string.addressnavat),
                getString(R.string.phonenavat),"42,8281248, 74,6038500"
            )
        )
        location.add(
            Location(
                "Фрунзе", R.drawable.resfrunze, getString(R.string.resfrunze),getString(R.string.addressfr),
                getString(R.string.phonefr),"42,878941, 74,607026"
            )
        )

        location.add(
            Location(
                "Фурусато", R.drawable.furusato, getString(R.string.resfuru),getString(R.string.addressfuru),
                getString(R.string.phonefuru),"42,866999, 74,601211"
            )
        )

        location.add(
            Location(
                "Барашек", R.drawable.barash, getString(R.string.resbar),getString(R.string.addressbar),
                getString(R.string.phonebar),"42,818436, 74,624446"
            )
        )

        val recyclerView = rootView.findViewById<RecyclerView>(R.id.rvLocation)
        linearLayoutManager = LinearLayoutManager(activity)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = linearLayoutManager
        adapter = LocationAdapter()
        recyclerView.adapter = adapter
        adapter!!.setData(location)
        return rootView
    }

}