interface Avioane {
    fun viteza()
}

class AvionSubsonic : Avioane {
    override fun viteza() {
        println("Avioane cu viteza maxima mai mica decat 0.9 mach")
    }
}

class AvionTranssonic : Avioane {
    override fun viteza() {
        println("Avioane cu viteza maxima cuprinsa intre 0.9 si 1.1 mach")
    }
}

class AvionSupersonic : Avioane {
    override fun viteza() {
        println("Avioane cu viteza maxima cuprinsa intre 1.1 si 5 mach")
    }
}

class AvionHipersonic : Avioane {
    override fun viteza() {
        println("Avioane cu viteza maxima mai mare de 5 mach")
    }
}

interface AvioaneFactory {
    fun getAvionSubsonic() : Avioane
    fun getAvionSupersonic() : Avioane
}

class Avion1Factory : AvioaneFactory {
    override fun getAvionSubsonic() : Avioane {
        return AvionSubsonic()
    }

    override fun getAvionSupersonic() : Avioane {
        return AvionSupersonic()
    }
}

class Avion2Factory : AvioaneFacctory {
    override fun getAvionSubsonic() : Avioane {
        return AvionTranssonic()
    }

    override fun getAvionSupersonic() : Avioane {
        return AvionHipersonic()
    }
}

fun main() {
    val avion1Factory: AvioaneFacctory = Avion1Factory()
    val avionSubsonic: Avioane = avion1Factory.getAvionSubsonic()
    val avionSupersonic: Avioane = avion1Factory.getAvionSupersonic()

    val avion2Factory: AvioaneFactory = Avion2Factory()
    val avionTranssonic: Avioane = avion2Factory.getAvionSubsonic()
    val avionHipersonic: Avioane = avion2Factory.getAvionSupersonic()

    avionSubsonic.viteza()
    avionTranssonic.viteza()
    avionSupersonic.viteza()
    avionHipersonic.viteza()
}