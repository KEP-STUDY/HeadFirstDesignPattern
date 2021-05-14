package harvey.strategy

open class Dog(
    private var eatBehavior: EatBehavior = 사료먹기()
){
    open fun eat() {
        eatBehavior.eat()
    }

    fun changeEatBehavior(eatBehavior: EatBehavior) {
        this.eatBehavior = eatBehavior
    }
}