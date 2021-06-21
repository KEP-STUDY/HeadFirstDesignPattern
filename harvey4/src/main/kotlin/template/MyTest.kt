package template

import template.mvvm.Chicken
import template.mvvm.Duck
import template.mvvm.Turkey
import template.strategytotemplate.고기먹는Siba
import template.strategytotemplate.밥먹는Siba
import template.strategytotemplate.사료먹는Siba

fun main() {

    //strategy -> template
    print("startegy to template\n")
    val siba = 밥먹는Siba()
    val siba2 = 고기먹는Siba()
    val siba3 = 사료먹는Siba()

    siba.먹기()
    siba2.먹기()
    siba3.먹기()

    //  param이 있는 경우
    print("\n\nmvvm\n")
    val duck = Duck()
    val chicken = Chicken("ㅠㅠ")
    val turkey = Turkey(1234L)

}