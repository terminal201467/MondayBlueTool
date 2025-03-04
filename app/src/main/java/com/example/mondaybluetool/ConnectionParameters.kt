package com.example.mondaybluetool

data class ConnectionParameters(
    val connectionInterval: Int,
    val slaveLatency: Int,
    val supervisionTimeout: Int,
    val mtuSize: Int,              // MTU 大小
    val txPhy: PhyMode,            // 發射物理層模式
    val rxPhy: PhyMode             // 接收物理層模式
)