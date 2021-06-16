package designPattern.factory.pizza

import designPattern.factory.pizzaIngredient.Ingredient
import designPattern.factory.pizzaIngredient.PizzaIngredientFactory

abstract class Pizza(val pizzaIngredientFactory: PizzaIngredientFactory) {
    var status: PizzaStatus = PizzaStatus.ORDER
        protected set
    var ingredients: MutableSet<Ingredient> = mutableSetOf()
        protected set
    var displayName: String? = null
        protected set


    abstract fun prepareIngredient(): MutableSet<Ingredient>

    fun prepare() {
        if (status != PizzaStatus.ORDER) {
            throw RuntimeException("피자 주문 순서가 옳지 않습니다.")
        }
        status = PizzaStatus.PREPEAR
        ingredients = this.prepareIngredient()
    }

    fun bake() {
        if (status != PizzaStatus.PREPEAR) {
            throw RuntimeException("피자 주문 순서가 옳지 않습니다.")
        }
        status = PizzaStatus.BAKE
    }

    fun cut() {
        if (status != PizzaStatus.BAKE) {
            throw RuntimeException("피자 주문 순서가 옳지 않습니다.")
        }
        status = PizzaStatus.CUT

    }

    fun box() {
        if (status != PizzaStatus.CUT) {
            throw RuntimeException("피자 주문 순서가 옳지 않습니다.")
        }
        status = PizzaStatus.BOX
    }

    fun delivery() {
        if (status != PizzaStatus.BOX) {
            throw java.lang.RuntimeException("피자 주문 순서가 옳지 않습니다.")
        }
        status = PizzaStatus.DELIVERY
    }
}