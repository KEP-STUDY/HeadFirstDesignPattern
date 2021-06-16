package factory.pizza

import factory.pizza.Pizza

class NYPotatoPizza : Pizza {
    override fun eaten() {
        print("뉴욕 포테이토 피자 먹힘")
    }
}