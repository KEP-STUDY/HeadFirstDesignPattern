package designPattern.factory.pizzaStore

import designPattern.factory.pizza.NYStyleCheesePizza
import designPattern.factory.pizza.Pizza
import designPattern.factory.pizza.PizzaType
import designPattern.factory.pizzaIngredient.ChicagoPizzaIngredientFactory

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: PizzaType): Pizza {
        val pizza = when (type) {
            PizzaType.CHEESE_PIZZA -> NYStyleCheesePizza(ChicagoPizzaIngredientFactory())
        }
        return pizza
    }

}