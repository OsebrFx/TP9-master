package TP9
//1
class MonThread(private val nom: String) : Runnable {
//2
    override fun run() {
        for (i in 1..5) {
            println("[$nom] Message $i du thread ${Thread.currentThread().name}")
            Thread.sleep(1000) // pause d'une seconde
        }
    }
}
//3
fun main() {

    val thread1 = Thread(MonThread("Thread A"))
    val thread2 = Thread(MonThread("Thread B"))
    val thread3 = Thread(MonThread("Thread C"))

    thread1.start()
    thread2.start()
    thread3.start()
}
