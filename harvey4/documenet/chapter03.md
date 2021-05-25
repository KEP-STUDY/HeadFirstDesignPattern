3장 데코레이터 패턴

상속x -> 객체 구성중 클래스를 꾸미기
사용할 객체를 상속하는 추상 클래스 생성
추상 클래스를 이용하여,

```
abstract class Employee(var jobType: String = "") {
    open fun showJobType() = jobType
    abstract fun working(): String
}

abstract class CompanyWorkDecorator : Employee() {
    abstract override fun showJobType(): String
}

class DeveloperWithReactJs(private var rider: Employee) : CompanyWorkDecorator() {
    override fun showJobType() = rider.showJobType() + "|프론트엔드"
    override fun working() = rider.working() + "|reactjs"
}

val developer = Developer("개발자")
val developerWithReactJs = DeveloperWithReactJs(developer)


- 참조 https://kimchanjung.github.io/design-pattern/2020/05/19/decorator-pattern/
```


OCP( Open Closed Principal )
확장에는 열리고 수정에는 닫히도록
=> 수정에 어려우면 확장도 어려워지고, 확장이 쉬워지면 수정도 어려워지는 trade off 관계 아님?
=> 바뀔것과 안바뀔것을 잘 분리하여, 안바뀔것은 close 바뀔것은 open
=> 데코레이터 패턴은 데코레이트 하여 쉽게 확장 - open /  그러나 기존 구현체 변경 막아 - closed

clean architecture - ocp를 잘 지키는 구조로 생각됨, 아랫쪽 수정x - 위쪽은 받아서 이용(확장?)

생각해본 단점

너무 중첩이 심해지면 생길 단점들
-> 디버깅이 어려워 질수도.. ex. 커피  cost의 가격이 틀림 -> 어디서 틀린건지…

순서가 중요한것에 쓰면 안됨
-> 책의 예제인 커피에 cost에 */ 가 붙는 다면 순서가 중요해짐  ex. saledCoffe - override fun cost() = super.cost()*0.9


질문 ->
1. java는 override 명시 안해줘도 되나? 예전 자바라 그런가?
2. ~~decorator를 왜  abstract로 해야하지? -> decorator 자체가 instance가 되면 안됨~~
