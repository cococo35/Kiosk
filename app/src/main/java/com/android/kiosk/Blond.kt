package com.android.kiosk

class Blond: AbstractKiosk() {
    override fun init(name: String, detail: MutableList<String>) {
        if(name.contains("W") && name.contains("00")){
            detail.add(name)
            println("메뉴에 추가되었습니다! 현재 메뉴: $detail")
        }
        else println("올바른 형식을 적어주세요! 메인 메뉴로 돌아갑니다...")
    }

    override fun menu(list: MutableList<String>) {
        println("Blond Menu")
        println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
        for(i in list.indices) println(list[i])
        println("0번: 메인 메뉴로")
    }
}