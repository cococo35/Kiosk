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
                Work.ColdBrewMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            2 -> {
                Work.BlondMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            3 -> {
                Work.EspressoMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            4 -> {
                Work.FrappuccinoMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            5 -> {
                Work.CakeMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }
        }
    }
}