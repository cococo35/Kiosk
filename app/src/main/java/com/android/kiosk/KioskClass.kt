package com.android.kiosk

 class KioskClass(private val menu: AbstractKioskMenu) {

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

    fun DetailMenu() {
        return menu.DetailMenu()
    }
}