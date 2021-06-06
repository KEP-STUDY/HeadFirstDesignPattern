package designPattern.factory.pizza

import designPattern.factory.pizzaIngredient.Ingredient
import designPattern.factory.pizzaIngredient.PizzaIngredientFactory

class NYStyleCheesePizza(pizzaIngredientFactory: PizzaIngredientFactory) : Pizza(pizzaIngredientFactory) {
    init {
        this.displayName = "뉴욕 치즈 피자"
    }

    override fun prepareIngredient(): MutableSet<Ingredient> {
        this.ingredients.add(pizzaIngredientFactory.createCheese())
        this.ingredients.add(pizzaIngredientFactory.createDough())
        this.ingredients.add(pizzaIngredientFactory.createSauce())
        return this.ingredients
    }
}