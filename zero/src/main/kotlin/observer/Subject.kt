package observer

interface Subject<T> {
    val observers: List<Observer>
    fun attach(observer: Observer)
    fun detach(observer: Observer)
    fun notifyObservers()
    fun emit(data: T)
}