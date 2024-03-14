package com.android.kiosk

//fun main() {
//    var thread: Thread? = null
//
//    while (true) {
//        thread?.interrupt()
//
//        thread = Thread {
//            try {
//                println("작업을 시작합니다.")
//                Thread.sleep(3000)
//            } catch (e: InterruptedException) {
//                return@Thread
//            }
//        }
//
//        thread.start()
//        thread.join()
//    }
//}
fun main() {
    val thread = Thread {
        try {
            println("작업을 시작합니다")
            Thread.sleep(3000)
        } catch (e: InterruptedException) {
            return@Thread
        }
    }
    while(true) {
        thread.interrupt()
        thread.start()
        thread.join()
    }
}
