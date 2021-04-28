package designPattern.strategy

interface FlyBehavior {
    fun fly(): String
}

class FlyWithWings : FlyBehavior {
    override fun fly(): String {
        val message = "FLY"
        println(message)
        return message
    }
}

class FlyNoWay : FlyBehavior {
    override fun fly(): String {
        val message = "CAN'T FLY"
        println(message)
        return message
    }
}