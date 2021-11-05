package com.decagon.mubarak.team_apt_take_home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.decagon.mubarak.team_apt_take_home.adapter.PowerUserAdapter
import com.decagon.mubarak.team_apt_take_home.databinding.FragmentPowerUserBinding
import com.decagon.mubarak.team_apt_take_home.util.listOfEnergyData

class PowerUserFragment : Fragment() {

    private var _binding: FragmentPowerUserBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: PowerUserAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentPowerUserBinding.inflate(inflater, container, false)
        adapter = PowerUserAdapter(listOfEnergyData)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.powerUserRecyclerView.adapter = adapter
        binding.powerUserRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
