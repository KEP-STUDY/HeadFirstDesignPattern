package observer

import java.util.*

class LinkedSubject<T> : Subject<T> {
    private var value: T? = null

    override val observers: MutableList<Observer> = LinkedList<Observer>()

    override fun emit(data: T) {
        value = data
    }

    override fun attach(observer: Observer) {
        observers.add(observer)
    }

    override fun detach(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(value)
        }
    }
}