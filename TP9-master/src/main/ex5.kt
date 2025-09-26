package TP9

fun main() {
    // 1
    val resultat: Int by lazy {
        println("Calcul en cours…")
        calculCouteux()
    }
    println("Programme démarré")

    // 2
    println("Avnt d'utiliser le résultat")

    // 3
    println("Le résultat du calcul coûteux est : $resultat")
}

// 1
fun calculCouteux(): Int {
    Thread.sleep(2000)
    return 42
}

