package template.mvvm

class Turkey(myName: Long) : Bird<Long>(myName) {

    override fun fly(param: Long?) {
        println("못날음 $param")
    }
}