import kotlin.math.pow
import kotlin.math.PI

class Volume {
    
    fun volum(length: Int) {
        val volumeCube = length.toDouble().pow(3.0)
        println("Volumul cubului cu latura $length este $volumeCube")
    }

    fun volum(radius: Double) {
        val volumeSphere = (4.00 / 3.00) * PI * radius.pow(3.0)
        println("Volumul sferei cu raza $radius este $volumeSphere")
    }

    fun volum(base: Int, height: Int) {
        val volumePyramid = (base.toDouble().pow(2.0) * height) / 3
        println("Volumul piramidei cu baza $base si inaltimea $height este $volumePyramid")
    }

    fun volum() {
        println("Volum")
    }
}

fun main() {
    val volume = Volume();
    volume.volum(5)
    volume.volum(3.5)
    volume.volum(2, 4)
    volume.volum()
}