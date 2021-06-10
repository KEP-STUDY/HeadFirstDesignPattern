package designPattern.factory.pizzaStore

abstract class PizzaStoreFactory {
    abstract fun createPizzaStore(location: Location): PizzaStore
}