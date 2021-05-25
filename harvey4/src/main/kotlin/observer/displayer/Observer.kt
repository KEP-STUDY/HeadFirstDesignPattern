package observer.displayer

import observer.data.WeatherDataSet

interface Observer {
    fun update(weatherDataSet: WeatherDataSet)
}