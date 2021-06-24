package designPattern.templateMethod

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class test {
    @Test
    fun main() {
        val coffeeRecipe = CoffeeRecipe()
        val redTeeRecipe = RedTeeRecipe()

        val coffeeAdditionalItems = setOf(Ingredient.SUGAR, Ingredient.MILK)
        val coffee = coffeeRecipe.make(coffeeAdditionalItems)
        assertThat(coffee.status).isEqualTo(Status.COMPLETE)
        assertThat(coffee.ingredients.toList()).isEqualTo(coffeeAdditionalItems.toList())

        val redTeeAdditionalItems = setOf(Ingredient.LEMON)
        val redTee = redTeeRecipe.make(redTeeAdditionalItems)
        assertThat(redTee.status).isEqualTo(Status.COMPLETE)
        assertThat(redTee.ingredients.toList()).isEqualTo(redTeeAdditionalItems.toList())


        assertThatThrownBy {
            coffeeRecipe.make(setOf(Ingredient.LEMON))
        }.hasMessage("커피에는 레몬이 들어가지 않습니다")
    }
}