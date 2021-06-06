# Singleton Pattern

## 고전적인 싱글턴 패턴 구현

```kotlin

class Singleton {
    private constructor()

    companion object {
        var uniqueInstance: Singleton? = null

        fun getInstance(): Singleton? {
            if (uniqueInstance == null) {
                uniqueInstance = Singleton()
            }
            return uniqueInstance
        }
    }
}

```

### 문제점

- multi thread 환경에서 오작동할수 있음
    - synchronized 사용
    - instance 정의시 생성
        - java 1.4 이하에선 사용 X
- [링크](https://stackoverflow.com/questions/137975/what-is-so-bad-about-singletons)
    - 테스트가 어렵다
        - 코드의 결합도를 높히기 때문에 테스트 및 변경에 유연하지 않습니다.
    - 스스로 객체 생명주기를 정하기 때문에 단일 책임 원칙을 위반

### 사용처

- Connection Pool
    - DB 커넥션 풀을 항상 새로 만들기 보단 기존의 커넥션 풀을 사용
- Spring Bean Scope
    - bean scope 를 통해 singleton을 지정하거나 @Configuration 을 지정하게 되면 Singleton으로 지정
        - 생성된 하나의 인스턴스는 single beans cache에 저장
    - why?
        - bean을 호출할때 설정값 같은 경우 매번 생성할 필요가 없음
        - 비교시 같은 인스턴스
          ![](https://gmlwjd9405.github.io/images/spring-framework/spring-bean.png)
    - How?
        - [CGLIB](https://github.com/cglib/cglib) 를 통해서 ByteCode 조작
- Logger