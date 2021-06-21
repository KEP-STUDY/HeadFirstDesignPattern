package template.strategytotemplate

abstract class Dog {
    abstract fun eat()

    fun 먹기() {
        print("맛있게 ")
        eat()
    }
}