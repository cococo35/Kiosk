package com.android.kiosk

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

        var select: Int = readln().toInt()

        when (select) {
            0 -> {
                println("키오스크 종료")
                return
            }

            1 -> {
                work = KioskClass(ColdBrew())
                work.menu(coldBrewList)

                select = readln().toInt()
                if(select == 0) continue
            }

            2 -> {
                work = KioskClass(Blond())
                work.menu(blondList)

                select = readln().toInt()
                if(select == 0) continue
            }

            3 -> {
                work = KioskClass(Espresso())
                work.menu(espressoList)

                select = readln().toInt()
                if(select == 0) continue
            }

            4 -> {
                work = KioskClass(Frappuccino())
                work.menu(frappuccinoList)

                select = readln().toInt()
                if(select == 0) continue
            }

            5 -> {
                work = KioskClass(Cake())
                work.menu(cakeList)

                select = readln().toInt()
                if(select == 0) continue
            }

            9 -> {
                println("추가할 메뉴를 선택해 주세요")
                println("[1] 콜드브루 커피, [2] 블론드, [3] 에스프레소, [4] 프라푸치노, [5] 케이크")
                select = readln().toInt()

                when(select) {
                    1 -> {
                        work = KioskClass(ColdBrew())
                        println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")
                        work.init(readln(), coldBrewList)
                    }
                    2 -> {
                        work = KioskClass(Blond())
                        println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")
                        work.init(readln(), blondList)
                    }
                    3 -> {
                        work = KioskClass(Espresso())
                        println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")
                        work.init(readln(), espressoList)
                    }
                    4 -> {
                        work = KioskClass(Frappuccino())
                        println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")
                        work.init(readln(), frappuccinoList)
                    }
                    5 -> {
                        work = KioskClass(Cake())
                        println("메뉴의 이름과 가격을 적어주세요! ([메뉴이름] W [가격])")
                        work.init(readln(), cakeList)
                    }
                }
            }
        }
    }
}

//- 메뉴판 번호는 숫자기에 숫자를 입력해야 하는데 문자를 입력했을 때,
//메뉴판에 없는 숫자를 입력했을 때,
//다시 입력할 수 있도록 **`예외처리`** 합니다.
//- 현재 잔액과 가격을 비교해서 구매 가능한 상태를 클래스에 추가적으로 구현합니다.
//- 예를 들어 구매할만큼 충분한 돈이 있는지도 상태에 포함시킵니다.
