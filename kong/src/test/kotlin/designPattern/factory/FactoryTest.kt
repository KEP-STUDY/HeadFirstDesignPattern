package designPattern.factory

import designPattern.factory.pizza.PizzaStatus
import designPattern.factory.pizza.PizzaType
import designPattern.factory.pizzaStore.Location
import designPattern.factory.pizzaStore.PizzaStoreFactoryImpl
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FactoryTest {
    @Test
    fun `뉴욕 피자집에서 치즈 피자를 시키면 뉴욕 치즈 피자를 줌`() {
        val location = Location.NEW_YORK
        val pizzaStore = PizzaStoreFactoryImpl().createPizzaStore(location)
        val pizza = pizzaStore.orderPizza(PizzaType.CHEESE_PIZZA)


        assertThat(pizza.status).isEqualTo(PizzaStatus.DELIVERY)
        assertThat(pizza.ingredients.size).isEqualTo(3)
        assertThat(pizza.displayName).isEqualTo("뉴욕 치즈 피자")
    }

    @Test
    fun `시카고 피자집에서 치즈 피자를 시키면 시카고 치즈 피자를 줌`() {
        val location = Location.CHICAGO
        val pizzaStore = PizzaStoreFactoryImpl().createPizzaStore(location)
        val pizza = pizzaStore.orderPizza(PizzaType.CHEESE_PIZZA)


        assertThat(pizza.status).isEqualTo(PizzaStatus.DELIVERY)
        assertThat(pizza.ingredients.size).isEqualTo(3)
        assertThat(pizza.displayName).isEqualTo("시카고 치즈 피자")
    }
}