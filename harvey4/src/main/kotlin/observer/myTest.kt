package observer

import observer.data.WeatherDataSet
import observer.displayer.AllDisplay
import observer.displayer.TempAndHumidDisplay
import observer.displayer.TempDisplay
import observer.observable.WeatherData

fun main() {

    val weatherData = WeatherData(WeatherDataSet(temp = 25.5f, humidity = 45.4f, pressure = 1070f))

    print("register temp and tempHumid Displayer\n")

    weatherData.register(TempDisplay())
    weatherData.register(TempAndHumidDisplay())

    print("\nWeatherData changed\n")


    weatherData.measureChanged(WeatherDataSet(temp = 400.5f, humidity = 90.4f, pressure = 2307f))

    print("\nregister all Displayer\n")

    weatherData.register(AllDisplay())

    print("\nWeatherData changed\n")

    weatherData.measureChanged(WeatherDataSet(temp = 800.5f, humidity = 123.4f, pressure = 5217f))

    print("\nonly temp changed\n")

    weatherData.measureChanged(WeatherDataSet(temp = 1600.5f))




}