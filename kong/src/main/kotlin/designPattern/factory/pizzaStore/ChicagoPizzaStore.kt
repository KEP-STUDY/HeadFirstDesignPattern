package designPattern.factory.pizzaStore

import designPattern.factory.pizza.ChicagoStyleCheesePizza
import designPattern.factory.pizza.Pizza
import designPattern.factory.pizza.PizzaType
import designPattern.factory.pizzaIngredient.ChicagoPizzaIngredientFactory

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(type: PizzaType): Pizza {
        val pizza = when (type) {
            PizzaType.CHEESE_PIZZA -> ChicagoStyleCheesePizza(ChicagoPizzaIngredientFactory())
        }
        return pizza
    }
}