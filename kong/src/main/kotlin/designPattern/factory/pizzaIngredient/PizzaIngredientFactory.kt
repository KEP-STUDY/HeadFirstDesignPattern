package designPattern.factory.pizzaIngredient

import designPattern.factory.pizzaIngredient.cheese.Cheese
import designPattern.factory.pizzaIngredient.dough.Dough
import designPattern.factory.pizzaIngredient.sauce.Sauce

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
}