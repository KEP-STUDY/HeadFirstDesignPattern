package designPattern.observer

class CurrentConditionDisPlay(weatherData: WeatherData) : Observer, DisplayElement {

    private var humidity: Float = 0.0f
    private var temperature: Float = 0.0f

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }

    override fun display(): String {
        val s = "Current conditions: $temperature F degrees and $humidity% humidity"
        println(s)
        return s
    }

    init {
        weatherData.registerObject(this)
    }

}
