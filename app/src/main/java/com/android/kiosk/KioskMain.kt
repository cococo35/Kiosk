package com.android.kiosk

import java.lang.NumberFormatException

fun main() {
    lateinit var work : KioskClass
    val coldBrewList = mutableListOf<String>()
    val blondList = mutableListOf<String>()
    val espressoList = mutableListOf<String>()
    val frappuccinoList = mutableListOf<String>()
    val cakeList = mutableListOf<String>()

    while(true) {

        println("[Star Cafe Menu]")
        println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
        println("[1] 콜드브루 커피")
        println("[2] 블론드")
        println("[3] 에스프레소")
        println("[4] 프라푸치노")
        println("[5] 케이크")
        println("[0] 키오스크 종료")

        try {
            var select: Int = readln().toInt()

            if(select in 0..5 || select == 9) {

                when (select) {
                    0 -> {
                        println("키오스크 종료")
                        return
                    }

                    1 -> {
                        work = KioskClass(ColdBrew())
                        work.menu(coldBrewList)

                        select = readln().toInt()
                        if (select == 0) continue
                    }

                    2 -> {
                        work = KioskClass(Blond())
                        work.menu(blondList)

                        select = readln().toInt()
                        if (select == 0) continue
                    }

                    3 -> {
                        work = KioskClass(Espresso())
                        work.menu(espressoList)

                        select = readln().toInt()
                        if (select == 0) continue
                    }

                    4 -> {
                        work = KioskClass(Frappuccino())
                        work.menu(frappuccinoList)

                        select = readln().toInt()
                        if (select == 0) continue
                    }

                    5 -> {
                        work = KioskClass(Cake())
                        work.menu(cakeList)

                        select = readln().toInt()
                        if (select == 0) continue
                    }

                    9 -> {
                        println("추가할 메뉴를 선택해 주세요")
                        println("[1] 콜드브루 커피, [2] 블론드, [3] 에스프레소, [4] 프라푸치노, [5] 케이크")
                        try {
                            select = readln().toInt()

                            if (select in 1..5) {

                                when (select) {
                                    1 -> {
                                        work = KioskClass(ColdBrew())
                                        println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")   // 메뉴 이름 양식 try..catch 만들기
                                        work.init(readln(), coldBrewList)
                                    }

                                    2 -> {
                                            work = KioskClass(Blond())
                                            println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")   // 메뉴 이름 양식 try..catch 만들기
                                            work.init(readln(), blondList)
                                        }

                                    3 -> {
                                            work = KioskClass(Espresso())
                                            println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")   // 메뉴 이름 양식 try..catch 만들기
                                            work.init(readln(), espressoList)
                                        }

                                    4 -> {
                                            work = KioskClass(Frappuccino())
                                            println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")   // 메뉴 이름 양식 try..catch 만들기
                                            work.init(readln(), frappuccinoList)
                                        }

                                    5 -> {
                                            work = KioskClass(Cake())
                                            println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")   // 메뉴 이름 양식 try..catch 만들기
                                            work.init(readln(), cakeList)
                                        }
                                }
                            } else {
                                println("올바른 숫자를 입력해주세요! 메인 메뉴로 돌아갑니다...")
                                println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
                            }
                        } catch (e: NumberFormatException) {
                            println("숫자를 입력해주세요! 메인 메뉴로 돌아갑니다...")
                            println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
                        }
                    }
                }
            } else println("올바른 숫자를 입력해주세요!")
        } catch (e:NumberFormatException) {
            println("숫자를 입력해주세요!")
        }
    }
}