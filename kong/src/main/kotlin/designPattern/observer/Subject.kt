package designPattern.observer

interface Subject {
    fun registerObject(o: Observer)
    fun removeObject(o: Observer)
    fun notifyObservers()
}