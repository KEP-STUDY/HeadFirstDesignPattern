package factory.factory

import factory.pizza.NYCheesePizza
import factory.pizza.NYPotatoPizza
import factory.pizza.Pizza

class NYPizzaFactory: PiazzaFactory {
    override fun createCheesePizza(): Pizza {
        print("뉴욕 치즈 피자 만들기 \n ")
        return NYCheesePizza()
    }

    override fun createPotatoPizza(): Pizza {
        print("뉴욕 포테이토 피자 만들기 \n")
        return NYPotatoPizza()
    }

}