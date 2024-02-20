class Pisici private constructor() {
    companion object {
        private var instance: Pisici? = null

        fun getInstance() : Pisici {
            if(instance == null) {
                instance = Pisici();
                println("S-a creat o noua instanta pentru clasa Pisici")
            }
            return instance!!
        }
    }

    fun singletonMessage(message: String) {
        println(message)
    }
}

fun main() {
    Pisici.getInstance().singletonMessage("Pisica siameza")
    Pisici.getInstance().singletonMessage("Pisica birmaneza")
    Pisici.getInstance().singletonMessage("Pisica scotish")
}