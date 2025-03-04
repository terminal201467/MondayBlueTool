package com.example.mondaybluetool

object BLEServiceInstance: BLEInterface {
    override fun scan() {
        TODO("Not yet implemented")
    }

    override fun connect(device: String) {
        TODO("Not yet implemented")
    }

    override fun disconnect() {
        TODO("Not yet implemented")
    }

    override fun readData(characteristic: String) {
        println("讀取數據，特徵值 UUID: $characteristic")
        // TODO: 調用 BluetoothGatt.readCharacteristic()
    }

    override fun writeData(characteristic: String, data: ByteArray) {
        println("寫入數據: ${data.contentToString()} 到特徵值 UUID: $characteristic")
        // TODO: 調用 BluetoothGatt.writeCharacteristic()
    }

    override fun enableNotification(characteristic: String) {
        println("啟用通知，特徵值 UUID: $characteristic")
        // TODO: 設定 BluetoothGattDescriptor，開啟通知
    }

    override fun getRSSI(): Int {
        val rssi = -60 // 假設 RSSI 為 -60dBm
        println("獲取設備 RSSI: $rssi")
        return rssi
        // TODO: 調用 BluetoothGatt.readRemoteRssi()
    }

    override fun getCurrentState(): BLEState {
        TODO("Not yet implemented")
    }
}