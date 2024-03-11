package com.android.kiosk

fun main() {

    var Work = KioskClass(ColdBrew())
    while(true) {

        Work.MainMenu()

        var sign: Int = readLine()!!.toInt()

        when (sign) {
            0 -> {
                println("키오스크 종료")
                return
            }

            1 -> {
                Work = KioskClass(ColdBrew())
                Work.DetailMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            2 -> {
                Work = KioskClass(Blond())
                Work.DetailMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            3 -> {
                Work = KioskClass(Espresso())
                Work.DetailMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            4 -> {
                Work = KioskClass(Frappuccino())
                Work.DetailMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }

            5 -> {
                Work = KioskClass(Cake())
                Work.DetailMenu()

                sign = readLine()!!.toInt()
                if (sign == 0) continue
            }
        }
    }
}