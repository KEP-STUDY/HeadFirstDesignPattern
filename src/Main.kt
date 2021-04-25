import strategy.Duck
import strategy.behavior.fly.FlyWings
import strategy.behavior.sound.DuckSound

fun main() {
    val duck = Duck()
    duck.replaceFly(FlyWings())
    duck.replaceSound(DuckSound())
    duck.doBehavior()

}