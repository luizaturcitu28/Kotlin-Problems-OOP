import java.time.LocalDate
import java.time.Period

class Student(
    private var nume: String,
    private var prenume: String,
    private var cnp: String,
    private var anNastere: Int,
    private var numeFacultate: String,
    private var anInfiintare: Int
) {
    fun setNume(nume: String) {
        this.nume = nume
    }
    
    fun getNume(): String {
        return this.nume
    }
    
    fun setPrenume(prenume: String) {
        this.prenume = prenume
    }
    
    fun getPrenume(): String {
        return this.prenume
    }
    
    fun setCNP(cnp: String) {
        this.cnp = cnp
    }
    
    fun getCNP(): String {
        return this.cnp
    }
    
    fun setAnNastere(anNastere: Int) {
        this.anNastere = anNastere
    }
    
    fun getAnNastere(): Int {
        return this.anNastere
    }
    
    fun setNumeFacultate(numeFacultate: String) {
        this.numeFacultate = numeFacultate
    }
    
    fun getNumeFacultate(): String {
        return this.numeFacultate
    }
    
    fun setAnInfiintare(anInfiintare: Int) {
        this.anInfiintare = anInfiintare
    }
    
    fun getAnInfiintare(): Int {
        return this.anInfiintare
    }
    
    fun getSex(): Char {
        return when (cnp[0]) {
            '1', '5' -> 'M'
            '2', '6' -> 'F'
            else -> 'N' // non-found
        }
    }

    fun getVarsta(): Int {
        val anCurent = LocalDate.now().year
        return anCurent - anNastere
    }

    fun getDiferentaAni(): Int {
        return anNastere - anInfiintare
    }
}

fun main() {
    val student = Student("Matei", "Mihai", "5010302407701", 2001, "Facultatea de Informatica", 1995)
    println("Nume: ${student.getNume()}")
    println("Prenume: ${student.getPrenume()}")
    println("CNP: ${student.getCNP()}")
    println("Sex: ${student.getSex()}")
    println("Varsta: ${student.getVarsta()}")
    println("Diferenta de ani dintre anul infiintarii facultatii si data nasterii studentului este de ${student.getDiferentaAni()} ani")
}