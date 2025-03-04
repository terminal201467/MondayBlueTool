package com.example.mondaybluetool

import android.bluetooth.le.ScanFilter
import java.util.*

interface BLEInterface {

    /**
     * 基本功能
     */
    fun scan()
    fun stopScan()
    fun connect(device: String)
    fun disconnect()
    fun reconnect()
    fun disconnectAll()
    fun connectMultiple(devices: List<String>)
    fun setAutoReconnect(enabled: Boolean, interval: Long)
    fun release()
    fun getDeviceInfo(): BLEDeviceInfo
    fun getCurrentState(): BLEState

    /**
     * 進階功能
     */
    fun readData(characteristic: String)
    fun writeData(characteristic: String, data: ByteArray)
    fun enableNotification(characteristic: String)
    fun getRSSI(): Int
    fun setOnConnectionStateChangeListener(listener: (BLEState) -> Unit)
    fun setOnDisconnectListener(listener: (reason: DisconnectReason) -> Unit)
    fun setOnFirmwareUpdateProgressListener(listener: (progress: Int) -> Unit)
    fun pairDevice()
    fun setEncryptionEnabled(enabled: Boolean)
    fun requestMTU(mtu: Int)
    fun startFirmwareUpdate(firmwareData: ByteArray)
    fun scanWithFilter(filters: List<ScanFilter>)
    fun setConnectionTimeout(timeout: Long)
    fun writeLargeData(characteristic: String, data: ByteArray, chunkSize: Int)
    fun getServicesAndCharacteristics(): Map<UUID, List<UUID>>
    fun setConnectionPriority(priority: ConnectionPriority)
    fun startRSSIMonitoring(interval: Long)
    fun stopRSSIMonitoring()
    fun setOnErrorListener(listener: (error: BLEError) -> Unit)
    fun getBatteryLevel(): Int
    fun setAdvertisementData(data: ByteArray)
    fun setPhyMode(txPhy: PhyMode, rxPhy: PhyMode)
    fun getConnectionParameters(): ConnectionParameters
    fun setLogger(logger: (message: String) -> Unit)

}