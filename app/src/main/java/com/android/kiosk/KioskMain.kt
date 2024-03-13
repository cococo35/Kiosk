package com.android.kiosk

import java.lang.NumberFormatException

fun main() {
    lateinit var work : KioskClass
    val menuList = mutableListOf(mutableListOf("시그니처 더 블랙 콜드 브루 W 19,600", "돌체 콜드 브루 W 6,000", "바닐라 크림 콜드 브루 W 5,800"),
                                 mutableListOf("블론드 스타벅스 돌체 라떼 W 5,400", "블론드 카페라떼 W 4,500", "블론드 카페 아메리카노 W 4,000"),
                                 mutableListOf("카페 모카 W 5,000", "카페 아메리카노 W 4,000", "카푸치노 W 4,500"),
                                 mutableListOf("자바 칩 프라푸치노 W 6,300", "카라멜 프라푸치노 W 5,900", "에스프레소 프라푸치노 W 5,500"),
                                 mutableListOf("체리 포레누아 케이크 W 7,500", "클래식 피스타치오 케이크 W 6,500", "클라우드 치즈 케이크 W 5,500"))

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
                        work.menu(menuList[0])

                        select = readln().toInt()
                        if (select == 0) continue
                    }

                    2 -> {
                        work = KioskClass(Blond())
                        work.menu(menuList[1])

                        select = readln().toInt()
                        if (select == 0) continue
                    }

                    3 -> {
                        work = KioskClass(Espresso())
                        work.menu(menuList[2])

                        select = readln().toInt()
                        if (select == 0) continue
                    }

                    4 -> {
                        work = KioskClass(Frappuccino())
                        work.menu(menuList[3])

                        select = readln().toInt()
                        if (select == 0) continue
                    }

                    5 -> {
                        work = KioskClass(Cake())
                        work.menu(menuList[4])

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
                                        println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")
                                        work.init(readln(), menuList[0])
                                    }

                                    2 -> {
                                            work = KioskClass(Blond())
                                            println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")
                                            work.init(readln(), menuList[1])
                                        }

                                    3 -> {
                                            work = KioskClass(Espresso())
                                            println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")
                                            work.init(readln(), menuList[2])
                                        }

                                    4 -> {
                                            work = KioskClass(Frappuccino())
                                            println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")
                                            work.init(readln(), menuList[3])
                                        }

                                    5 -> {
                                            work = KioskClass(Cake())
                                            println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")
                                            work.init(readln(), menuList[4])
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