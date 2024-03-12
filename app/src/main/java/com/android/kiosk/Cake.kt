package com.android.kiosk

class Cake: AbstractKiosk() {
    override fun init(name: String, detail: MutableList<String>) {
        detail.add(name)
        println("메뉴에 추가되었습니다! 현재 메뉴: $detail")
    }

    override fun menu(list: MutableList<String>) {
        println("Cake Menu")
        println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
        for(i in list.indices) println(list[i])
        println("0번: 메인 메뉴로")
    }
}