package com.android.kiosk

fun main() {
    while(true) {
        println("[Star Cafe Menu]")
        println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
        println("[1] 콜드브루 커피")
        println("[2] 블론드")
        println("[3] 에스프레소")
        println("[4] 프라푸치노")
        println("[5] 케이크")
        println("[0] 키오스크 종료")

        var sign: Int = readLine()!!.toInt()

        when (sign) {
            0 -> {
                println("키오스크 종료")
                return
            }

            1 -> {
                println("[ColdBrew Menu]")
                println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
                println("[1] 시그니처 더 블랙 콜드 브루")
                println("[2] 돌체 콜드 브루")
                println("[3] 바닐라 크림 콜드 브루")
                println("[0] 메인 메뉴로")

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            2 -> {
                println("[Blond Menu]")
                println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
                println("[1] 블론드 바닐라 더블샷 마키아또")
                println("[2] 블론드 카페라떼")
                println("[3] 블론드 카페 아메리카노")
                println("[0] 메인 메뉴로")

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            3 -> {
                println("[Espresso Menu]")
                println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
                println("[1] 카페 아메리카노")
                println("[2] 카푸치노")
                println("[3] 에스프레소")
                println("[0] 메인 메뉴로")

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            4 -> {
                println("[Frappuccino Menu]")
                println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
                println("[1] 자바 칩 프라푸치노")
                println("[2] 카라멜 프라푸치노")
                println("[3] 에스프레소 프라푸치노")
                println("[0] 메인 메뉴로")

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            5 -> {
                println("[Cake Menu]")
                println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
                println("[1] 체리 포레누아 케이크")
                println("[2] 마스카포네 티라미슈 케이크")
                println("[3] 클라우드 치즈 케이크")
                println("[0] 메인 메뉴로")

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }
        }
    }
}