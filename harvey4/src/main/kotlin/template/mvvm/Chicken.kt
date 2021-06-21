package template.mvvm

class Chicken(userId: String) : Bird<String>(userId) {
    override fun fly(param: String?) {
        println("못날음 $param")
    }

}