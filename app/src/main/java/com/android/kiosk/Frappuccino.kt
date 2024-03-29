package com.android.kiosk

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Frappuccino: AbstractKiosk() {
    override fun init(name: String, price: Int, detail: MutableList<String>) {
        val nameAndPrice = "$name W $price"
        detail.add(nameAndPrice)
        println("메뉴에 추가되었습니다! 현재 메뉴: $detail")
    }

    override fun menu(list: MutableList<String>, money: Int) {
        println("Frappuccino Menu")
        println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
        for(i in list.indices) {
            print("[${i + 1}] ")
            print(list[i])
            if(list[i].substringAfter("W ").toInt() > money) print(" (구매 불가)")
            else print(" (구매 가능)")
            println()
        }
    }

    override fun buy(select: Int, buyMenuList: MutableList<String>, money: Int): Int {
        val buyDateTime: LocalDateTime = LocalDateTime.now()
        val buyDateTimeFormat = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss")
        val buyDateTimeDay = buyDateTime.format(buyDateTimeFormat)
        if(buyMenuList[select - 1].substringAfter("W ").toInt() > money) {
            println("잔액 부족!")
            return money
        }
        for(i in buyMenuList.indices) {
            if(buyMenuList[i] == buyMenuList[select - 1] && buyMenuList[i].substringAfter("W ").toInt() <= money) {
                println("구매 완료 (현재 시간: $buyDateTimeDay)")
                println("잔액: ${money - buyMenuList[i].substringAfter("W ").toInt()}")
                return money - buyMenuList[i].substringAfter("W ").toInt()
            }
        }
        return money
    }
}