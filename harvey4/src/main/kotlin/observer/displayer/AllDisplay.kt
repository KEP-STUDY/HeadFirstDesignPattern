package observer.displayer

import observer.data.WeatherDataSet

class AllDisplay : Observer {

    override fun update(weatherDataSet: WeatherDataSet) {
        display(weatherDataSet)
    }

    private fun display(weatherDataSet: WeatherDataSet) {
        println("All Displyer temp ${weatherDataSet.temp} humidity ${weatherDataSet.humidity} pressure ${weatherDataSet.pressure}")
    }
}