package designPattern.templateMethod

class RedTeeRecipe : DrinkRecipeTemplate() {
    override fun setUpDrink(): RedTee {
        return RedTee()
    }

    override fun boilWater(drink: Drink): Drink {
        drink.status = Status.MAKING
        println("물을 끓입니다")
        return drink
    }

    override fun brew(drink: Drink): Drink {
        println("홍차를 우립니다")
        return drink
    }

    override fun pourIntoCup(drink: Drink): Drink {
        println("컵에 붓습니다.")
        return drink
    }

    override fun addAsYouLike(drink: Drink, additionalItems: Set<Ingredient>): Drink {
        println(additionalItems.joinToString(", ") + "을 추가합니다.")
        additionalItems.forEach {
            drink.addIngredient(it)
        }
        drink.status = Status.COMPLETE
        return drink
    }
}