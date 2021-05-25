package designPattern.observer

class ForecastDisplay(weatherData: WeatherData) : Observer, DisplayElement {

    private var humidity: Float = 0.0f
    private var temperature: Float = 0.0f

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }

    override fun display(): String {
        val s = "현재 온도는 $temperature 도 이고, 습도는 $humidity %입니다"
        println(s)
        return s
    }

    init {
        weatherData.registerObject(this)
    }

}
