package observer.observable

import observer.data.WeatherDataSet
import observer.displayer.Observer

interface Observable {
    fun register(o: Observer)
    fun unregister(o: Observer)
    fun notifyObserver(weatherDataSet: WeatherDataSet)
}
