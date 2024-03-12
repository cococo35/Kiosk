package com.android.kiosk

class KioskClass(private val kiosk: AbstractKiosk) {
    fun init(name: String, detail: MutableList<String>) {
        return kiosk.init(name, detail)
    }

    fun menu(list: MutableList<String>) {
        return kiosk.menu(list)
    }
}