package factory.factory

import factory.pizza.Pizza

interface PiazzaFactory {
    fun createCheesePizza(): Pizza
    fun createPotatoPizza(): Pizza
}

