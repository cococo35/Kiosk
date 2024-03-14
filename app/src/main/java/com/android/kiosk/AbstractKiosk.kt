package com.android.kiosk

abstract class AbstractKiosk {
    abstract fun init(name: String, price: Int, detail: MutableList<String>)

    abstract fun menu(list: MutableList<String>, money: Int)

    abstract fun buy(select: Int, buyMenuList: MutableList<String>, money: Int): Int
}