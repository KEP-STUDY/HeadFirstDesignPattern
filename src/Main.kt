import strategy.Duck
import strategy.behavior.fly.FlyWings
import strategy.behavior.fly.NonFly
import strategy.behavior.sound.DuckSound

fun main() {
    val duck = Duck(FlyWings(), DuckSound())
    duck.doBehavior()

    println("[오리가 사고가 나서 날 수가 없게 됨 ㅠㅠ]")
    duck.replaceFly(NonFly())
    duck.doBehavior()

}