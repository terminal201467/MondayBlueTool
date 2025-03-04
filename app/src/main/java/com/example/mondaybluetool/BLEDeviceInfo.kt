package com.example.mondaybluetool

data class BLEDeviceInfo(
    val name: String,
    val address: String,
    val batteryLevel: Int?,
    val firmwareVersion: String?
)