package com.android.kiosk

class Frappuccino: AbstractKioskMenu() {
    override fun DetailMenu() {
        println("[Frappuccino Menu]")
        println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
        println("[1] 자바 칩 프라푸치노    | W 6,300 |")
        println("[2] 카라멜 프라푸치노     | W 5,900 |")
        println("[3] 에스프레소 프라푸치노  | W 5,500 |")
        println("[0] 메인 메뉴로")
    }
}