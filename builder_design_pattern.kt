class Salate {
    private var ingredient1: String = ""
    private var ingredient2: String = ""
    private var ingredient3: String = ""
    private var ingredient4: String = ""
    private var ingredient5: String = ""

    fun setIngredient1(ingredient1: String) {
        this.ingredient1 = ingredient1
    }
    
    fun setIngredient2(ingredient2: String) {
        this.ingredient2 = ingredient2
    }

    fun setIngredient3(ingredient3: String) {
        this.ingredient3 = ingredient3
    }

    fun setIngredient4(ingredient4: String) {
        this.ingredient4 = ingredient4
    }

    fun setIngredient5(ingredient5: String) {
        this.ingredient5 = ingredient5
    }

    fun display() {
        println("Ingredient 1: $ingredient1")
        println("Ingredient 2: $ingredient2")
        println("Ingredient 3: $ingredient3")
        println("Ingredient 4: $ingredient4")
        println("Ingredient 5: $ingredient5")
    }
}

interface SaladBuilder {
    fun buildIngredient1(ingredient1: String)
    fun buildIngredient2(ingredient2: String)
    fun buildIngredient3(ingredient3: String)
    fun buildIngredient4(ingredient4: String)
    fun buildIngredient5(ingredient5: String)
    fun getResult() : Salate
}

class IngredientsSaladBuilder {
    private val salate = Salate()

    override fun buildIngredient1(ingredient1: String) {
        salate.setIngredient1(ingredient1)
    }

    override fun buildIngredient2(ingredient2: String) {
        salate.setIngredient2(ingredient2)
    }

    override fun buildIngredient3(ingredient3: String) {
        salate.setIngredient3(ingredient3)
    }

    override fun buildIngredient4(ingredient4: String) {
        salate.setIngredient4(ingredient4)
    }

    override fun buildIngredient5(ingredient5: String) {
        salate.setIngredient5(ingredient5)
    }

    override fun getResult() : Salate {
        return salate
    }
}

class SaladAssembler {
    fun assembleSalate(builder: SaladBuilder): Salate {
        builder.buildIngredient1("Pui")
        builder.buildIngredient2("Porumb")
        builder.buildIngredient3("Hummus")
        builder.buildIngredient4("Castraveti")
        builder.buildIngredient5("Telemea de vaci")
        return builder.getResult()
    }
}

fun main() {
    val ingredientsBuilder = IngredientsSaladBuilder()
    val assembler = SaladAssembler()
    val salata = assembler.assembleSalate(ingredientsBuilder)

    println("Ingredientele salatei: ")
    salata.display()
}