package com.decagon.mubarak.team_apt_take_home.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.decagon.mubarak.team_apt_take_home.databinding.PowerUserItemListBinding
import com.decagon.mubarak.team_apt_take_home.model.Energy

class PowerUserAdapter(private val listOfItem: List<Energy>) : RecyclerView.Adapter<PowerUserAdapter.PowerUserViewHolder>() {

    inner class PowerUserViewHolder(val binding: PowerUserItemListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PowerUserViewHolder {
        return PowerUserViewHolder(
            PowerUserItemListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: PowerUserViewHolder, position: Int) {

        holder.binding.apply {
            powerUserDateTextView.text = listOfItem[position].date
            powerUserPercentageTextView.text = "${listOfItem[position].savingPercentage}%"
            powerUserVoltageTextView.text = listOfItem[position].energyVoltage
        }

        if (holder.binding.powerUserPercentageTextView.text.dropLast(1).toString().toInt() > 40) {
            holder.binding.powerUserPercentageTextView.setTextColor(Color.GREEN)
        }

    }

    override fun getItemCount(): Int = listOfItem.size
}
