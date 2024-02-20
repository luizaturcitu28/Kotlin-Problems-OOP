open class Angajat protected constructor(protected var nume: String, protected var salariu: Double) {
    
    open fun afisareDetalii() {
        println("Nume: $nume, salariu: $salariu")
    }

    open fun calculareSalariu() {
        println("Salariul angajatului $nume este de: $salariu")
    }
}

class AngajatB protected constructor(nume: String, salariu: Double, protected var bonus: Double) : Angajat(nume, salariu) {
    override fun afisareDetalii() {
        super.afisareDetalii()
        println("Salariu bonus: $bonus")
    }

    override fun calculareSalariu() {
        val salariuTotal = salariu + bonus
        println("Salariul angajatului $nume este: $salariuTotal")
    }
}

class AngajatC protected constructor(nume: String, salariu: Double, bonus: Double, private var spor: Double) :  AngajatB(nume, salariu, bonus) {
    override fun afisareDetalii() {
        super.afisareDetalii()
        println("Spor: spor")
    }

    override fun calculareSalariu() {
        val salariuTotal = salariu + bonus + spor
        println("Salariul angajatului $nume este: $salariuTotal")
    }
}

fun main {
    val angajat = AngajatC("Mihai", 5546.23, 700.00, 500.00)
    println("Detalii angajat: ")
    angajat.afisareDetalii()
    println(" Calculul salariului: ")
    angajat.calculareSalariu()
}