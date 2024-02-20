class Car(val model: String, var year: Int, var color: String, var brand: String) {

    constructor(model: String, color: String, brand: String) = this(model, 0, color, brand) {
        //se realizeaza setarea anului 0
    }

    fun display() {
        println("Model: $model")
        println("Year: $year")
        println("Color: $color")
        println("Brand: $brand")
    }
}

fun main() {

    //obiecte pentru constructorul primar

    val car1 = Car("Puma", 2016, "red", "Ford")
    val car2 = Car("Corolla", 2014, "green", "Toyota")
    println("Information about car1: ")
    car1.display()
    println("\nInformation about car2: ")
    car2.display()

    //obiecte pentru constructorul secundar

    val car3 = Car("V60", "white", "Volvo")
    val car4 = Car("Duster", "black", "Dacia")
    println("\nInformation about car3: ")
    car3.display()
    println("\nInformation about car4: ")
    car4.display()
}