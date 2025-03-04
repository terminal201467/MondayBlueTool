package com.example.mondaybluetool

sealed class DisconnectReason {
    object UserDisconnected : DisconnectReason()  // 用戶手動斷開
    object DeviceDisconnected : DisconnectReason()  // 設備主動斷開
    object ConnectionLost : DisconnectReason()  // 信號超出範圍或設備休眠
    data class Error(val errorCode: Int, val message: String) : DisconnectReason()  // 具體錯誤信息
    object Unknown : DisconnectReason()  // 未知原因
}