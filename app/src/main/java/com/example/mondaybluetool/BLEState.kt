package com.example.mondaybluetool

sealed interface BLEState {
    object Connected : BLEState
    object Disconnected : BLEState
    object Scanning : BLEState
    data class Error(val message: String) : BLEState
}