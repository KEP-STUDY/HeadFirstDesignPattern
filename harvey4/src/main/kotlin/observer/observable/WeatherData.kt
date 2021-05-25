package observer.observable

import observer.data.WeatherDataSet
import observer.displayer.Observer

class WeatherData(
    private var weatherDataSet: WeatherDataSet
) : Subject {

    private var observers: MutableList<Observer> = mutableListOf()

    fun measureChanged(weatherDataSet: WeatherDataSet) {
        this.weatherDataSet = WeatherDataSet(
            weatherDataSet.temp ?: this.weatherDataSet.temp,
            weatherDataSet.humidity ?: this.weatherDataSet.humidity,
            weatherDataSet.pressure ?: this.weatherDataSet.pressure
        )
        notifyObserver(this.weatherDataSet)
    }

    override fun register(o: Observer) {
        observers.add(o)
        o.update(this.weatherDataSet)
    }

    override fun unregister(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObserver(weatherDataSet: WeatherDataSet) {
        observers.forEach {
            it.update(weatherDataSet)
        }
    }
}

