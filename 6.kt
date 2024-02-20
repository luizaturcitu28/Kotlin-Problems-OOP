open class Beer protected constructor(var type: String = "", var origin: String = "")

class BeerTypeA(type: String, origin: String, var labelShape: String = "", var length: Int = 0) : Beer(type, origin)

class BeerTypeB(type: String, origin: String, var labelShape: String = "", var radius: Double = 0.0) : Beer(type, origin)

class BeerTypeC(type: String, origin: String, var labelShape: String = "", var base: Double = 0.0, var height: Double = 0.0) : Beer(type, origin)

fun main() {
    val beerA = BeerTypeA("Bucegi", "Romania", "Square", 5)
    val beerB = BeerTypeB("Ciucas", "Romania", "Round and Transparent", 2.5)
    val beerC = BeerTypeC("Celis", "Belgia", "Right Triangle", 3.0, 4.5)

    println("Type A Beer - Label Shape: ${beerA.labelShape}, length: ${beerA.length}")
    println("Type B Beer - Label Shape: ${beerB.labelShape}, radius: ${beerB.radius}")
    println("Type C Beer - Label Shape: ${beerC.labelShape}, base: ${beerC.base}, height: ${beerC.height}")
}