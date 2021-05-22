package observer

interface Observer {
    fun <T> update(data: T)
}