package com.example.tourguide


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShopFragment : Fragment() {
    private var linearLayoutManager: LinearLayoutManager? = null
    private var adapter: LocationAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.location_list, container, false)

        val location = ArrayList<Location>()
        location.add(
            Location(
                "ЦУМ", R.drawable.tsum, getString(R.string.tsum),getString(R.string.addresstsum),
                getString(R.string.phonetsum),"42.876260, 74.614568"
            )
        )
        location.add(
            Location(
                "Бишкек парк", R.drawable.bish, getString(R.string.bish),
                getString(R.string.addressbish),getString(R.string.phonebish),"42.874775, 74.590483"
            )
        )
        location.add(
            Location(
                "Азия Молл", R.drawable.asiamall, getString(R.string.asiamall),
                getString(R.string.addressasiamall),getString(R.string.phoneasiamall),"42.855592, 74.585055"
            )
        )

        location.add(
            Location(
                "Дордой Плаза", R.drawable.dor, getString(R.string.dordoy),getString(R.string.addressdordoy),
                getString(R.string.phonedordoy),"42.874341, 74.618110"
            )
        )

        location.add(
            Location(
                "Вефа Центр", R.drawable.vefa, getString(R.string.vefa),getString(R.string.addressvefa),
                getString(R.string.phonevefa),"42.857598, 74.609477"
            )
        )
        location.add(
            Location(
                "ГУМ", R.drawable.gum, getString(R.string.gum),
                getString(R.string.addressgum),getString(R.string.phonegum),"42.875021,74.614290"
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