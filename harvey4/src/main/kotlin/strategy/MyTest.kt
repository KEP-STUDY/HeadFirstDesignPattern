package strategy

fun main() {

    val siba = Siba("개1")
    val siba2 = Siba("개2")

    siba.eat()
    siba2.eat()

    siba.changeEatBehavior(eatBehavior = 밥먹기())
    siba2.changeEatBehavior(eatBehavior = 고기먹기())

    siba.eat()
    siba2.eat()

    val justDog = Dog()
    justDog.eat()

}