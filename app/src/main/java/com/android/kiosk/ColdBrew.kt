package com.android.kiosk

class ColdBrew: AbstractKiosk() {
    override fun init(name: String, price: Int, detail: MutableList<String>) {
        val nameAndPrice = "$name W $price"
        detail.add(nameAndPrice)
        println("메뉴에 추가되었습니다! 현재 메뉴: $detail")
    }

    override fun menu(list: MutableList<String>, money: Int) {
        println("Cold Brew Menu")
        println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
        for(i in list.indices) {
            print(list[i])
            if(list[i].substringAfter("W ").toInt() > money) print(" (구매 불가)")
            else print(" (구매 가능)")
            println()
        }
        println("0번: 메인 메뉴로")
    }
}