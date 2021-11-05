package com.decagon.mubarak.team_apt_take_home.util

import com.decagon.mubarak.team_apt_take_home.R
import com.decagon.mubarak.team_apt_take_home.model.Device
import com.decagon.mubarak.team_apt_take_home.model.Energy
import com.decagon.mubarak.team_apt_take_home.model.Setting

val listOfEnergyData = listOf(
    Energy("October, 2021", 40, "301,81kWh"),
    Energy("September, 2021", 60, "296,81kWh"),
    Energy("August, 2021", 30, "396,81kWh")
)
val listOfDevice = listOf(
    Device(R.drawable.ic_home_air_conditional, "Air Conditioner", "3 Device"),
    Device(R.drawable.ic_home_lighting, "Lighting", "5 lamp"),
    Device(R.drawable.ic_device_item_list_wifi_router, "Wifi Router", "2 Device"),
    Device(R.drawable.ic_home_smart_tv, "Smart Tv", "2 Device")
)

val listOfSetting = listOf(
    Setting(R.drawable.ic_airwave, "Airwave", "25°C"),
    Setting(R.drawable.icon_heating, "Heating", "18°C"),
    Setting(R.drawable.ic_cooling, "Cooling", "21°C"),
)

