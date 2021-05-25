package designPattern.observer

class WeatherData : Subject {

    private var pressure: Float = 0.0f
    private var humidity: Float = 0.0f
    private var temperature: Float = 0.0f
    private var observers: MutableList<Observer> = mutableListOf()

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    private fun measurementsChanged() {
        notifyObservers()
    }

    override fun registerObject(o: Observer) {
        observers.add(o)
    }

    override fun removeObject(o: Observer) {
        observers.removeIf { it == o }
    }

    override fun notifyObservers() {
        for (o in observers) {
            o.update(temperature, humidity, pressure)
        }
    }

}