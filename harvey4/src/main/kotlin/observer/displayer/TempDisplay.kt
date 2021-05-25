package observer.displayer

import observer.data.WeatherDataSet

class TempDisplay : Observer {

    override fun update(weatherDataSet: WeatherDataSet) {
        display(weatherDataSet)
    }

    private fun display(weatherDataSet: WeatherDataSet) {
        println("TempDisplyer temp ${weatherDataSet.temp}")
    }
}