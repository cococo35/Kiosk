package com.android.kiosk

fun init(name: String, price: Int){
    var ColdBrewMenuList = arrayListOf<String>("시그니처 더 블랙 콜드 브루 W 9,600", "돌체 콜드 브루 W 6,000", "바닐라 크림 콜드 브루 W 5,800")
    ColdBrewMenuList += "${name} W ${price}"
}