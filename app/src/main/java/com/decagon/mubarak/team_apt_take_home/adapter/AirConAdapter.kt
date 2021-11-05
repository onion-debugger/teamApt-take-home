package com.decagon.mubarak.team_apt_take_home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.decagon.mubarak.team_apt_take_home.databinding.AirCondSettingItemBinding
import com.decagon.mubarak.team_apt_take_home.model.Setting

class AirConAdapter(private val listOfSettings: List<Setting>) : RecyclerView.Adapter<AirConAdapter.AirConViewHolder>() {

    inner class AirConViewHolder(val binding: AirCondSettingItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AirConAdapter.AirConViewHolder {
        return AirConViewHolder(
            AirCondSettingItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AirConAdapter.AirConViewHolder, position: Int) {
        holder.binding.apply {
            airCondSettingsIcon.setImageResource(listOfSettings[position].icon)
            airCondSettingsLabelTextView.text = listOfSettings[position].settingLabel
            airCondSettingsTemperature.text = listOfSettings[position].degree
        }
    }

    override fun getItemCount(): Int = listOfSettings.size
}