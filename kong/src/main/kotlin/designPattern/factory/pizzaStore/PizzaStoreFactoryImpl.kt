package designPattern.factory.pizzaStore

class PizzaStoreFactoryImpl : PizzaStoreFactory() {
    override fun createPizzaStore(location: Location): PizzaStore {
        return when (location) {
            Location.CHICAGO -> ChicagoPizzaStore()
            Location.NEW_YORK -> NYPizzaStore()
        }
    }
}