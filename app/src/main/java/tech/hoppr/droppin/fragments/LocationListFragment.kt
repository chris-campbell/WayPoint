package tech.hoppr.droppin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_location_list.view.*
import tech.hoppr.droppin.R


class LocationListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_location_list, container, false)

        view.addLocationButton.setOnClickListener {
            findNavController().navigate(R.id.action_locationListFragment_to_mapsFragment)
        }

        setHasOptionsMenu(true)

        return view
    }


}