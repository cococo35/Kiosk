package com.android.kiosk

class List(private val list:AbstractList) {
    fun init(name: String, price: Int) {
        ColdBrewMenuList += "${name} W ${price}"
    }
}