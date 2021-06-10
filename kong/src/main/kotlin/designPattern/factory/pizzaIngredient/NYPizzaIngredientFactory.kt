package designPattern.factory.pizzaIngredient

import designPattern.factory.pizzaIngredient.cheese.Cheese
import designPattern.factory.pizzaIngredient.cheese.MozzarellaCheese
import designPattern.factory.pizzaIngredient.dough.Dough
import designPattern.factory.pizzaIngredient.dough.ThinDough
import designPattern.factory.pizzaIngredient.sauce.Sauce
import designPattern.factory.pizzaIngredient.sauce.TomatoSauce

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinDough()
    }

    override fun createSauce(): Sauce {
        return TomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }
}