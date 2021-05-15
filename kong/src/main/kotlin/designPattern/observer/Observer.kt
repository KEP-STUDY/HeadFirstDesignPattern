package designPattern.observer

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float)
}
