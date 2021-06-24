package designPattern.templateMethod

open class Drink {
    var status: Status = Status.READY
    var ingredients: MutableSet<Ingredient> = mutableSetOf()

    fun addIngredient(ingredient: Ingredient) {
        ingredients.add(ingredient)
        ingredients
    }
}
