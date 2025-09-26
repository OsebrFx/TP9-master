package TP9

// 1
class Configuration {
    init {
        println("Chargement de la configuration complexe…")
        Thread.sleep(2000)
        println("Configuration chargée !")
    }

    fun afficherParametres() {
        println("Paramètres de la configuration : param1=42, param2='Kotlin'")
    }
}

// 2
class App {
    val config: Configuration by lazy {
        println("Initialisation de la configuration dans App…")
        Configuration()
    }

    fun demarrer() {
        println("Application démarrée")
        println("Avant d'utiliser la configuration")

        // 3
        config.afficherParametres()
        println("Configuration utilisée avec succès !")
    }
}

fun main() {
    val app = App()
    app.demarrer()
}
