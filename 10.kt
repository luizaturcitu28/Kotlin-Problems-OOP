open class Carte(private val titlu: String, private val autor: String) {
    open fun afisareDetalii() {
        println("Titlu: $titlu\nAutor: $autor")
    }
}

fun afisareDetaliiPrieten(carte: Carte) {
    println("Detalii despre carte de la functia prieten: \nTitlu: {$carte.titlu} \nAutor: {$carte.autor}")
}

class PrietenCarte {
    companion object {
        fun afisareDetaliiPrieten(carte: Carte) {
            println("Detalii despre carte de la clasa prieten: \nTitlu: {$carte.titlu}\nAutor: {$carte.autor}")
        }
    }
}

class CarteMatematica(titlu: String, autor:String, private val nrPagini: Int) : Carte(titlu, autor) {
    override fun afisareDetalii() {
        println("Tip: Carte Matematica\n")
        super.afisareDetalii()
        println("Numar pagini: $nrPagini")
    }
}

fun main() {
    val carteMatematica = CarteMatematica("Paralela 45", "Marius Perianu", 378)
    afisareDetaliiPrieten(carteMatematica)
    PrietenCarte.afisareDetaliiPrieten(carteMatematica)
    carteMatematica.afisareDetalii()
}