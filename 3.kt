import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class CurrentData {
    init {
        val currentData = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
        val formatData = currentData.format(formatter)
        println("Data curenta este: $formatData")
    }
}

fun main() {
    val object = CurrentData()
}