package template.mvvm

class Duck : Bird<Long>() {
    override fun fly(param: Long?) {
        println("날기")
    }
}