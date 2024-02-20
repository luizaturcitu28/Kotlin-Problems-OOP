package gradleexample;

class Student {
    val nume: String,
    val prenume: String,
    val grupa: String,
    val goodParts: String,
    val badParts: String,
    val activities: String,
    val aspirations: String
}

fun main() 
{
    val objectStudent = Student {
        "Turcitu",
        "Luiza Alexandra",
        "321AC",
        "Mi-a placut atmosfera si faptul ca am primit ajutor de fiecare data cand am avut nevoie",
        "Mi-as fi dorit sa facem mai multe exercitii practice la laborator",
        "Am participat la un maraton de creare a unei aplicatii in html, css, javascript, react si am citit cateva carti",
        "Mi-ar placea sa lucrez pe partea de frontend sau backend, de asemenea ma atrage si inteligenta artificiala, insa imi doresc sa experimentez cat mai multe lucruri noi"
 }
    
    println("Nume: ${objectStudent.nume}")
    println("Prenume: ${objectStudent.prenume}")
    println("Grupa: ${objectStudent.grupa}")
    println("Ceea ce mi-a placut: ${objectStudent.goodParts}")
    println("Ceea ce nu mi-a placut: ${objectStudent.badParts}")
    println("Ce am facut vara aceasta: ${objectStudent.activities}")
    println("Ce imi doresc sa fac dupa terminarea facultatii: ${objectStudent.aspirations}")
}