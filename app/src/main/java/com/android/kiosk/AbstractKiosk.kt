package com.android.kiosk

abstract class AbstractKiosk {
    abstract fun init(name: String, price: Int, detail: MutableList<String>)

    abstract fun menu(list: MutableList<String>, money: Int)
}