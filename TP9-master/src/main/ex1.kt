package TP9
//1
fun main() {
    print("Entrez le premier nombre : ")
    val n1 = readLine()?.toDoubleOrNull() ?: 0.0
    print("Entrez le deuxième nombre : ")
    val n2 = readLine()?.toDoubleOrNull() ?: 0.0
//2
    println("\n--- Résultats ---")
    println("Addition : ${n1 + n2}")
    println("Soustraction : ${n1 - n2}")
    println("Multiplication : ${n1 * n2}")
    println(if (n2 != 0.0) "Division : ${n1 / n2}" else "Division impossible (division par zéro)")
    println("Le premier nombre est-il supérieur au second ? ${n1 > n2}")
    println("La somme des deux nombres est ${(n1 + n2).toInt().let { if (it % 2 == 0) "paire" else "impaire" }}")
}

