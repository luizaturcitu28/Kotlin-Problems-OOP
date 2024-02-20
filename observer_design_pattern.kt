import java.util.*

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float) 
}

class WeatherStation {
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f
    private var pressure: Float = 0.0f
    private val observers: MutableList<Observer> = ArrayList()
    
    fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers() {
        for (observer in observers) {
            observer.update(temperature, humidity, pressure)
        }
    }

    fun setMeasurements(temp: Float, humid: Float, press: Float) {
        temperature = temp
        humidity = humid
        pressure = press
        notifyObservers()
    }
}

class Display : Observer {
    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        println("Display: Temperature = $temperature°C, Humidity = $humidity%, Pressure = $pressure hPa")
    }
}

fun main() {
    val weatherStation = WeatherStation()

    val display1 = Display()
    val display2 = Display()

    weatherStation.registerObserver(display1)
    weatherStation.registerObserver(display2)

    weatherStation.setMeasurements(27.3f, 60f, 1013.2f)
    weatherStation.setMeasurements(23.7f, 57f, 1014.7f)
}