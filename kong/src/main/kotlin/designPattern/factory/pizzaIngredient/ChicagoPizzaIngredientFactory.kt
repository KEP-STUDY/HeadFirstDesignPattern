package designPattern.factory.pizzaIngredient

import designPattern.factory.pizzaIngredient.cheese.Cheese
import designPattern.factory.pizzaIngredient.cheese.ReggianoCheese
import designPattern.factory.pizzaIngredient.dough.Dough
import designPattern.factory.pizzaIngredient.dough.ThickDough
import designPattern.factory.pizzaIngredient.sauce.MarinaraSauce
import designPattern.factory.pizzaIngredient.sauce.Sauce

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickDough()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }
}