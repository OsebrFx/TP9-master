package TP9

// 1
class UtilisateurService {
    init {
        println("UtilisateurService est en cours d'initialisation…")
    }
    fun afficherUtilisateur() {
        println("Affichage des informations de l'utilisateur : nom=John Doe, id=1")
    }
}

// 2
class Application {
    lateinit var service: UtilisateurService

    // 3
    fun initialiserService() {
        println("Initialisation du service UtilisateurService…")
        service = UtilisateurService()
        println("Service initialisé !")
    }
    fun utiliserService() {
        println("Utilisation du service UtilisateurService…")
        service.afficherUtilisateur()
    }
}
fun main() {
    val app = Application()
    app.initialiserService()
    app.utiliserService()
}
