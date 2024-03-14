package com.android.kiosk

class KioskClass(private val kiosk: AbstractKiosk) {
    fun init(name: String, price: Int, detail: MutableList<String>) {
        return kiosk.init(name, price, detail)
    }

    fun menu(list: MutableList<String>, money: Int) {
        return kiosk.menu(list, money)
    }

    fun buy(select: Int, buyMenuList: MutableList<String>, money: Int): Int {
        return kiosk.buy(select, buyMenuList, money)
    }
}