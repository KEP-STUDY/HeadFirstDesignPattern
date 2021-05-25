package observer.displayer

import observer.data.WeatherDataSet

class TempAndHumidDisplay : Observer {

    override fun update(weatherDataSet: WeatherDataSet) {
        display(weatherDataSet)
    }

    private fun display(weatherDataSet: WeatherDataSet) {
        println("TempAndHumidDisplyer temp ${weatherDataSet.temp} humidity ${weatherDataSet.humidity}")
    }
}