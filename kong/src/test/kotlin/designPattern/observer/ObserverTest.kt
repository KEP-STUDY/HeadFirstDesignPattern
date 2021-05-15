package designPattern.observer

import org.junit.jupiter.api.Test

class ObserverTest {
    @Test
    fun main() {
        val weatherData = WeatherData()

        CurrentConditionDisPlay(weatherData)
        StatisticsDisplay(weatherData)
        ForecastDisplay(weatherData)

        weatherData.setMeasurements(80f, 65f, 30.4f)
    }
}