import strategy.Duck
import strategy.behavior.fly.FlyWings
import strategy.behavior.fly.NonFly
import strategy.behavior.sound.DuckSound
import strategy.behavior.sound.NonSound

fun main() {
    val duck = Duck(FlyWings(), DuckSound())
    duck.doBehavior()

    println("[오리가 사고가 나서 날 수가 없게 됨 ㅠㅠ]")
    duck.replaceFly(NonFly())
    duck.doBehavior()

    println("[합병증이 도져서 말도 할 수 없게 됨 ㅠㅠ]")
    duck.replaceSound(NonSound())
    duck.doBehavior()
}