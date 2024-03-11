package com.android.kiosk

fun main() {
    
    var Work = KioskClass()
    while(true) {

        Work.MainMenu()

        var sign: Int = readLine()!!.toInt()

        when (sign) {
            0 -> {
                println("키오스크 종료")
                return
            }

            1 -> {
                Work = ColdBrew()
                Work.ColdBrewMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            2 -> {
                Work = Blond()
                Work.BlondMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            3 -> {
                Work = Espresso()
                Work.EspressoMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            4 -> {
                Work = Frappuccino()
                Work.FrappuccinoMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            5 -> {
                Work = Cake()
                Work.CakeMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }
        }
    }
}