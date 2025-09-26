package TP9

// 1
class DatabaseConnection {
    var estConnecte: Boolean = false
    fun connecter() {
        println("Connexion à la base de données en cours…")
        Thread.sleep(1000) // Simule le temps de connexion
        estConnecte = true
        println("Connexion établie !")
    }
    fun deconnecter() {
        estConnecte = false
        println("Déconnexion de la base de données")
    }
}

// 2
class DatabaseManager {
    lateinit var connexion: DatabaseConnection

    // 3
    fun initialiserConnexion() {
        println("Initialisation de la connexion…")
        connexion = DatabaseConnection()
        connexion.connecter()
    }

    fun executerRequete() {
        if (::connexion.isInitialized && connexion.estConnecte) {
            println("Exécution de la requête sur la base de données…")
        } else {
            println("Erreur : la connexion n'est pas initialisée ou n'est pas connectée !")
        }
    }
}
fun main() {
    val manager = DatabaseManager()
    manager.initialiserConnexion()
    manager.executerRequete()
}



