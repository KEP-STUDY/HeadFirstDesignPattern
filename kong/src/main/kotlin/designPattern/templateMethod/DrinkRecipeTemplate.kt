package designPattern.templateMethod

abstract class DrinkRecipeTemplate {
    fun make(additionalItems: Set<Ingredient>): Drink {
        val drink = setUpDrink()
        val drinkByBoil = this.boilWater(drink)
        val drinkByBrews = this.brew(drinkByBoil)
        val drinkWithCup = this.pourIntoCup(drinkByBrews)
        return this.addAsYouLike(drinkWithCup, additionalItems)
    }

    abstract fun setUpDrink(): Drink
    abstract fun boilWater(drink: Drink): Drink
    abstract fun brew(drink: Drink): Drink
    abstract fun pourIntoCup(drink: Drink): Drink
    abstract fun addAsYouLike(drink: Drink, additionalItems: Set<Ingredient>): Drink

}