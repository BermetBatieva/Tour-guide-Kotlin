package com.example.tourguide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ParksFragment : Fragment() {
    var linearLayoutManager: LinearLayoutManager? = null
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
                "Парк Панфилова", R.drawable.panfil,
                getString(R.string.panfilov), getString(R.string.addresspan),
                getString(R.string.phonepanfilov),
                "42.878178,74.600564"
            )
        )
        location.add(
            Location(
                "Дубовый парк", R.drawable.dub, getString(R.string.dub),
                getString(R.string.addressdub), getString(R.string.phonedub),
                "42.878023,74.607169"
            )
        )
        location.add(
            Location(
                "Парк победы", R.drawable.pobeda, getString(R.string.pobeda),
                getString(R.string.addresspob), getString(R.string.phonepob),
                "42.826431,74.604214"
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