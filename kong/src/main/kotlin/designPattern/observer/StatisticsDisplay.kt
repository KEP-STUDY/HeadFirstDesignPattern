package designPattern.observer

class StatisticsDisplay(weatherData: WeatherData) : Observer, DisplayElement {

    private var humidities: MutableList<Float> = mutableListOf()
    private var temperatures: MutableList<Float> = mutableListOf()
    private var pressures: MutableList<Float> = mutableListOf()

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperatures.add(temperature)
        this.humidities.add(humidity)
        this.pressures.add(pressure)
        display()
    }

    override fun display(): String {
        val s =
            "statistics conditions: ${temperatures.average()} F degrees and ${humidities.average()}% humidity and ${pressures.average()} pressure"
        println(s)
        return s
    }

    init {
        weatherData.registerObject(this)
    }
}
