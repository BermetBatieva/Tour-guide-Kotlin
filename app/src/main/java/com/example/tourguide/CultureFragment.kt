package com.example.tourguide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CultureFragment : Fragment() {
    private var linearLayoutManager: LinearLayoutManager? = null
    private var adapter: LocationAdapter? = null
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.location_list, container, false)

        val location = ArrayList<Location>()
        location.add(Location("Театр оперы и балета ",
                        R.drawable.operbalet,
                        getString(R.string.operbalet),
                        getString(R.string.addressoper),
                        getString(R.string.phoneoper),
                        "42.878133,74.612777"
                )
        )
        location.add(Location("Музей Г.Айтиева",R.drawable.gapar,
                getString(R.string.gapar), getString(R.string.addressgap),
                getString(R.string.phonegap),
                "42.878745,74.610872")
        )
        location.add(Location("Филармония",R.drawable.filar,
                        getString(R.string.filar),
                        getString(R.string.addressfilar),
                        getString(R.string.phonefilar),
                        "42.878028,74.587688"
                )
        )
        location.add(Location("Русский театр драмы",R.drawable.rus, getString(R.string.rus),
                        getString(R.string.addressrus), getString(R.string.phonerus),
                        "42.877640,74.608976"
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