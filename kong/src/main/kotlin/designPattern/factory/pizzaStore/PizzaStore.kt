package designPattern.factory.pizzaStore

import designPattern.factory.pizza.Pizza
import designPattern.factory.pizza.PizzaType


abstract class PizzaStore {

    fun orderPizza(type: PizzaType): Pizza {
        val pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        pizza.delivery()
        return pizza
    }

    abstract fun createPizza(type: PizzaType): Pizza
}