package designPattern.strategy

interface QuackBehavior {
    fun quack(): String
}


class Quack : QuackBehavior {
    override fun quack(): String {
        val message = "Quack"
        println(message)
        return message
    }
}

class Squack : QuackBehavior {
    override fun quack(): String {
        val message = "Squack"
        println(message)
        return message
    }
}

class MuteQuack : QuackBehavior {
    override fun quack(): String {
        val message = ""
        println(message)
        return message
    }
}
