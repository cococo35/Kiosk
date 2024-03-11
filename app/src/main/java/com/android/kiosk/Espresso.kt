package com.android.kiosk

class Espresso: AbstractKioskMenu() {
    override fun DetailMenu() {
        println("[Espresso Menu]")
        println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
        println("[1] 카페 아메리카노 | W 4,500 |")
        println("[2] 카푸치노       | W 5,000 |")
        println("[3] 에스프레소     | W 4,500 |")
        println("[0] 메인 메뉴로")
    }
}