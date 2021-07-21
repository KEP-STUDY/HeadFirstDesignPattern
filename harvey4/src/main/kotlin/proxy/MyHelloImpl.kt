package proxy

class MyHelloImpl : MyHello{
    override fun sayHi(name: String, word: String) {
        println("my name $name and $word")
    }

    override fun sayNothing() {
        print(".....")
    }

}