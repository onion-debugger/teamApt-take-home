package com.decagon.mubarak.team_apt_take_home.adapter

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.decagon.mubarak.team_apt_take_home.databinding.HomeDeviceItemListBinding
import com.decagon.mubarak.team_apt_take_home.model.Device
import com.decagon.mubarak.team_apt_take_home.util.onItemClicked

class DeviceAdapter(private val listOfDevice: List<Device>, var clickListener: onItemClicked) :
    RecyclerView.Adapter<DeviceAdapter.DeviceViewHolder>() {

    inner class DeviceViewHolder(val binding: HomeDeviceItemListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeviceAdapter.DeviceViewHolder {
        return DeviceViewHolder(
            HomeDeviceItemListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DeviceAdapter.DeviceViewHolder, position: Int) {
        holder.binding.apply {
            homeDeviceImage.setImageResource(listOfDevice[position].iconImage)
            homeDeviceNameTextView.text = listOfDevice[position].deviceName
            homeDeviceNumbersTextView.text = listOfDevice[position].deviceNumber
        }

        holder.binding.homeCardCardView.setOnClickListener {
            clickListener.onClickedItem(position)
        }

        holder.binding.switchView.setOnCheckedChangeListener { buttonView, isChecked ->
            if (!isChecked) {
                buttonView.buttonTintList = ColorStateList.valueOf(Color.YELLOW)
            }
        }
    }

    override fun getItemCount(): Int = listOfDevice.size
}
