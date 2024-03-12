package com.android.kiosk

abstract class AbstractKiosk {
    abstract fun init(name: String, detail: MutableList<String>)

    abstract fun menu(list: MutableList<String>)
}