open class Country {
    open fun print() {
        println("This is my country")
    }
    
    open fun printOfficialLanguage() {
        println("This is the official language of the country")
    }
    
    open fun printLocation() {
        println("This is the location of the country")
    }
}

class France : Country() {
    override fun print() {
        println("France is my country")
    }
    
    override fun printOfficialLanguage() {
        println("The official language in France is French")
    }
    
    override fun printLocation() {
        println("France is located in Western Europe")
    }
}

class Spain : Country() {
    override fun print() {
        println("Spain is my country")
    }
    
    override fun printOfficialLanguage() {
        println("The official language in Spain is Spanish")
    }
    
    override fun printLocation() {
        println("Spain is located in extreme Western Europe")
    }
}

class Germany : Country() {
    override fun print() {
        println("Germany is my country")
    }
    
    override fun printOfficialLanguage() {
        println("The official language in Germany is German")
    }
    
    override fun printLocation() {
        println("Germany is located in Central Europe")
    }
}

fun main() {
    val france = France()
    val spain = Spain()
    val germany = Germany()
    
    val country1: Country = france
    country1.print()
    country1.printOfficialLanguage()
    country1.printLocation()
    
    val country2: Country = spain
    country2.print()
    country2.printOfficialLanguage()
    country2.printLocation()
    
    val country3: Country = germany
    country3.print()
    country3.printOfficialLanguage()
    country3.printLocation()
}