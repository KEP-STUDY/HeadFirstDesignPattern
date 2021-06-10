package designPattern.factory.pizza

import designPattern.factory.pizzaIngredient.Ingredient
import designPattern.factory.pizzaIngredient.PizzaIngredientFactory

class ChicagoStyleCheesePizza(pizzaIngredientFactory: PizzaIngredientFactory) : Pizza(pizzaIngredientFactory) {
    init {
        this.displayName = "시카고 치즈 피자"
    }

    override fun prepareIngredient(): MutableSet<Ingredient> {
        this.ingredients.add(pizzaIngredientFactory.createCheese())
        this.ingredients.add(pizzaIngredientFactory.createDough())
        this.ingredients.add(pizzaIngredientFactory.createSauce())
        return this.ingredients
    }
}