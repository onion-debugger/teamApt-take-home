package com.decagon.mubarak.team_apt_take_home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.decagon.mubarak.team_apt_take_home.adapter.DeviceAdapter
import com.decagon.mubarak.team_apt_take_home.databinding.FragmentHomeLayoutBinding
import com.decagon.mubarak.team_apt_take_home.util.listOfDevice
import com.decagon.mubarak.team_apt_take_home.util.onItemClicked

class HomeLayoutFragment : Fragment(), onItemClicked {

    private var _binding: FragmentHomeLayoutBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerViewAdapter: DeviceAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeLayoutBinding.inflate(inflater, container, false)
        recyclerViewAdapter = DeviceAdapter(listOfDevice, this)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.homeDeviceRecyclerView.adapter = recyclerViewAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClickedItem(position: Int) {
        if (position == 0) {
            findNavController().navigate(R.id.airConditionerFragment)
        }
    }

}
