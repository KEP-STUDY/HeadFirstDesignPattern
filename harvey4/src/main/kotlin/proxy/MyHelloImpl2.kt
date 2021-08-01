package proxy

class MyHelloImpl2 : MyHello2{
    override fun sayHi3(name: String, word: String) {
        println("in hello2 - my name $name and $word")
    }

    override fun sayHi2(name: String, word: String) {
        println("in hello2 - hi2 - my name $name and $word")
    }

    override fun sayNothing2() {
        print("2: .....")
    }

}