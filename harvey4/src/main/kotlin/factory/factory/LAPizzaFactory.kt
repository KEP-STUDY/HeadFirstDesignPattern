package factory.factory

import factory.pizza.*

class LAPizzaFactory: PiazzaFactory {
    override fun createCheesePizza(): Pizza {
        print("엘에이 치즈 피자 만들기 \n")
        return LACheesePizza()
    }

    override fun createPotatoPizza(): Pizza {
        print("엘에이 포테이토 피자 만들기 \n")
        return LAPotatoPizza()
    }

}