package observer

class Observable(val name: String) : Observer {
    override fun <T> update(data: T) {
        println("$name : $data")
    }
}