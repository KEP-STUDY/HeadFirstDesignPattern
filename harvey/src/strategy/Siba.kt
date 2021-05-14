package harvey.strategy

class Siba(private val name: String, eatBehavior: EatBehavior = 사료먹기()) : Dog(eatBehavior) {
    override fun eat() {
        println("$name ")
        super.eat()
    }
}