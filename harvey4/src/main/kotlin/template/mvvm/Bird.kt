package template.mvvm

abstract class Bird<PARAM>(param: PARAM? = null) {

    init {
        fly(param)
    }

    abstract fun fly(param: PARAM? = null)

}