package proxy

import java.lang.reflect.Proxy.newProxyInstance

fun main() {

    val myHello: MyHello = MyHelloImpl()
    val myHello2: MyHello2 = MyHelloImpl2()

    val proxy = newProxyInstance(
        MyHello::class.java.classLoader,
        arrayOf(MyHello::class.java, MyHello2::class.java)
    ) { proxy, method, args ->

        //proxyㅇㅔ서 바로 구현
        if (method.name.contains("Hi")) {
            println("impl in proxy ${args?.joinToString(", ")}")
        }

//        method.invoke(myHello, *args.orEmpty())


        when (method.declaringClass) {
            MyHello::class.java -> method.invoke(myHello, *args.orEmpty())
            MyHello2::class.java -> method.invoke(myHello2, *args.orEmpty())
            else -> {
                println("not proper interface")
            }
        }

        // interface list의 첫번째가 아닌것은 obj로 사용 불가
        // method.invoke(myHello2, *args.orEmpty())
    }


    //  casting은 되나.. MyHello으로..
    (proxy as MyHello).sayHi("juho", "hello")
    (proxy as MyHello2).sayHi2("juho", "hello")
    println()
    proxy.sayNothing()

    //        abstract class도 사용 불가
    //        val proxyUseAbs = newProxyInstance(
    //            Bye::class.java.classLoader,
    //            arrayOf(Bye::class.java)
    //        ) { proxy, method, args ->
    //            if (method.name.contains("say")) {
    //                println(args?.joinToString(", "))
    //            }
    //        } as Bye
    //
    //        proxyUseAbs.sayBye("abstract juho", "bye")


}