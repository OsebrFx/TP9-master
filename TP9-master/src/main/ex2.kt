package TP9
//1
fun main() {
    print("Entrez la note du premier examen : ")
    val note1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Entrez la note du deuxième examen : ")
    val note2 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Entrez la note du troisième examen : ")
    val note3 = readLine()?.toDoubleOrNull() ?: 0.0
//2
    val moyenne = (note1 + note2 + note3) / 3
//3
    val message = when {
        moyenne >= 80 -> "Réussi avec mention excellente"
        moyenne >= 50 -> "Réussi"
        else -> "Échoué"
    }
//4
    println("\n--- Résultat ---")
    println("Moyenne : $moyenne")
    println("Statut : $message")
}
