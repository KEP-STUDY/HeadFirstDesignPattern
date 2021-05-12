package designPattern.strategy

abstract class Duck(private var flyBehavior: FlyBehavior, private var quackBehavior: QuackBehavior) {
    fun setFlyStrategy(flyBehavior: FlyBehavior) {
        this.flyBehavior = flyBehavior
    }

    fun setSoundStrategy(quackBehavior: QuackBehavior) {
        this.quackBehavior = quackBehavior
    }

    fun performFly(): String {
        return this.flyBehavior.fly()
    }

    fun performQuack(): String {
        return this.quackBehavior.quack()
    }

    abstract fun display(): String
}

