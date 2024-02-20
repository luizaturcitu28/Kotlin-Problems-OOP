class Engine {
    fun start() {
        println("Engine started")
    }
    fun stop() {
        println("Engine stopped")
    }
}

class Lights {
    fun turnOn() {
        println("Lights on")
    }
    fun turnOff() {
        println("Lights off")
    }
}

class ChristmasTree {
    private val engine = Engine()
    private val lights = Lights()
    
    fun startChristmasTree() {
        engine.start()
        lights.turnOn()
        println("The Christmas tree is lightening all the house")
    }
    fun stopChristmasTree() {
        lights.turnOff()
        engine.stop()
        println("The Christmas tree stopped lightening all the house")
    }
}

fun main() {
    val christmasTree = ChristmasTree()
    christmasTree.startChristmasTree()
    
    christmasTree.stopChristmasTree()
}