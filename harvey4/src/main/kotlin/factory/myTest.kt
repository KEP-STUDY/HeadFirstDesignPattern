package factory

import factory.factory.LAPizzaFactory
import factory.factory.NYPizzaFactory
import factory.factory.PiazzaFactory
import factory.pizza.Pizza
import kotlin.random.Random

fun main() {

    val randomLocation = Random.nextBoolean()

    val pizzaFactory: PiazzaFactory = if (randomLocation) NYPizzaFactory() else LAPizzaFactory()

    val randomPizza = Random.nextBoolean()

    val pizza: Pizza = if(randomPizza) pizzaFactory.createCheesePizza() else pizzaFactory.createPotatoPizza()

    pizza.eaten()
}