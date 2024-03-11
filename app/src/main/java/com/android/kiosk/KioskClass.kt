package com.android.kiosk

 open class KioskClass {

    fun MainMenu() {
        println("[Star Cafe Menu]")
        println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
        println("[1] 콜드브루 커피")
        println("[2] 블론드")
        println("[3] 에스프레소")
        println("[4] 프라푸치노")
        println("[5] 케이크")
        println("[0] 키오스크 종료")
    }

    open fun ColdBrewMenu() {}

    open fun BlondMenu() {}

    open fun EspressoMenu() {}

     open fun FrappuccinoMenu() {}

     open fun CakeMenu() {}
}