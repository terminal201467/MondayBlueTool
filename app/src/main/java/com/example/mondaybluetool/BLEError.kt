package com.example.mondaybluetool

sealed class BLEError {
    // 連接相關錯誤
    object ConnectionFailed : BLEError()
    object Disconnected : BLEError()
    object ConnectionTimeout : BLEError()

    // 掃描相關錯誤
    object ScanFailed : BLEError()
    object ScanPermissionDenied : BLEError()

    // 讀寫相關錯誤
    object ReadFailed : BLEError()
    object WriteFailed : BLEError()
    object InvalidCharacteristic : BLEError()

    // 通知相關錯誤
    object NotificationSetupFailed : BLEError()

    // 其他錯誤
    object UnknownError : BLEError()
    data class CustomError(val message: String) : BLEError()
}