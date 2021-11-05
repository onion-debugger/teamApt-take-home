package com.decagon.mubarak.team_apt_take_home

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import com.decagon.mubarak.team_apt_take_home.adapter.AirConAdapter
import com.decagon.mubarak.team_apt_take_home.databinding.FragmentAirConditionerBinding
import com.decagon.mubarak.team_apt_take_home.util.listOfSetting

class AirConditionerFragment : Fragment() {

    private var _binding: FragmentAirConditionerBinding? = null
    private val binding get() = _binding!!
    private var domieDataForDropDown = ArrayList<String>()
    private lateinit var dropDown: Spinner

    private lateinit var airConRecyclerViewAdapter: AirConAdapter

    private var progressCount = 27

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentAirConditionerBinding.inflate(inflater, container, false)
        domieDataForDropDown = arrayListOf("Device 1", "Device 2", "Device 3")

        val adapter = ArrayAdapter<String>(
            requireContext(),
            R.layout.select_dialog_item,
            domieDataForDropDown
        )
        dropDown = binding.deviceSpinner
        dropDown.adapter = adapter

        airConRecyclerViewAdapter = AirConAdapter(listOfSetting)

        updateProgressCount()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.airConditionerRecyclerView.adapter = airConRecyclerViewAdapter

        binding.progressBarAdd.setOnClickListener {
            if (progressCount < 30) {
                progressCount += 1
                updateProgressCount()
            }
        }

        binding.progressBarMinus.setOnClickListener {
            if (progressCount >= 10) {
                progressCount -= 1
                updateProgressCount()
            }
        }
    }

    private fun updateProgressCount() {
        binding.progressBar.progress = progressCount
        binding.progressBarText.text = "$progressCount°C"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
