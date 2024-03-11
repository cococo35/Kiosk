package com.android.kiosk

class ColdBrew: AbstractKioskMenu() {
    override fun DetailMenu() {
        println("[ColdBrew Menu]")
        println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
        println("[1] 시그니처 더 블랙 콜드 브루 | W 9,600 | ")
        println("[2] 돌체 콜드 브루           | W 6,000 |")
        println("[3] 바닐라 크림 콜드 브루     | W 5,800 |")
        println("[0] 메인 메뉴로")
    }

    override fun init(name: String, price: Int) {
        var ColdBrewMenuList = arrayListOf<String>("시그니처 더 블랙 콜드 브루 W 9,600", "돌체 콜드 브루 W 6,000", "바닐라 크림 콜드 브루 W 5,800")
        ColdBrewMenuList += "${name} W ${price}"
    }
}