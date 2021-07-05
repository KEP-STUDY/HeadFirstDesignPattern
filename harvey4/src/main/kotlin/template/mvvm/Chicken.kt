package template.mvvm

class Chicken<T>(userId: T) : Bird<T>(userId) {
    override fun fly(param: T?) {
        println("날기 $param")
    }
}