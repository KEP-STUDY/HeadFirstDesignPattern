package designPattern.templateMethod

abstract class DrinkRecipeTemplate {
    fun make(additionalItems: Set<Ingredient>): Drink {
        val drink = setUpDrink()
        val drinkByBoil = this.boilWater(drink)
        val drinkByBrews = this.brew(drinkByBoil)
        val drinkWithCup = this.pourIntoCup(drinkByBrews)
        return this.addAsYouLike(drinkWithCup, additionalItems)
    }

    protected abstract fun setUpDrink(): Drink
    protected abstract fun boilWater(drink: Drink): Drink
    protected abstract fun brew(drink: Drink): Drink
    protected abstract fun pourIntoCup(drink: Drink): Drink
    protected abstract fun addAsYouLike(drink: Drink, additionalItems: Set<Ingredient>): Drink

}