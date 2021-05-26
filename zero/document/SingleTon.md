# 첫번 째 의문점

? 정적 메소드

? 스태틱

## 알고자 하는 것 : 과연 어디에 할당이 되서 사용되는가??

JVM 구조를 확인해보자

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f630c1c3-6701-48f1-8b9e-a27a4b6e5e15/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f630c1c3-6701-48f1-8b9e-a27a4b6e5e15/Untitled.png)

Class Loader : 바이트 코드로 변환된 .java코드를 JVM에 올린다.

Execution Engine : 바이트 코드들을 명령어 단위로 하나씩 가져와서 실행

- 인터프리터 : 바이트 코드를 하나씩 읽어 해석, 전체적인 실행속도 저하
- JIT : 런타임에 바이트 코드를 컴파일하여 네이티브 코드로 변경 직접 네이티브 코드를 실행하는 방식

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4150d6fa-e286-42f8-95fb-58c642b13b17/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4150d6fa-e286-42f8-95fb-58c642b13b17/Untitled.png)

PC : 수행 중인 명령 주소

Stack : 스택 프레임(Stack Frame)이라는 구조체를 저장하는 스택

Native Method Stack : Java 외의 언어로 작성된 네이티브 코드를 위한 스택

Heap : 인스턴스가 형성되는 공간

Method Area : 스태틱 변수, 상수 등 런타임 상수 풀 : 클래스, 인터페이스의 상수 뿐만아니라, 메서드와 필드에 대한 모든 레퍼런스까지 담고있는 테이블 (포인터들의 집합체..?)

## 결론

- static 변수들은 모두 컴파일타임에 Method Area에 할당이 된다.
- 스레드 별개로 올라가있는 영역이므로 어디서든 접근이 가능하다.

# 두 번째 의문점

그렇다면 kotlin의 object는 어떤 방식으로 싱글톤을 생성할까?

→ 2번째 방법 (실행시 만들어버린다)

```java
object Example {
    private val data = 0
    fun doSomething() {

    }
}
public final class Example {
   private static final int data;
   @NotNull
   public static final Example INSTANCE;

   public final void doSomething() {
   }

   private Example() {
   }

   static {
      Example var0 = new Example();
      INSTANCE = var0;
   }
}
```

# 세 번째 의문점

코틀린의 object은 만능일까?

→ 생각해보자...

Zero가 생각한 문제점

1. 레이지 호출이 불가능하다.
2. **생성자 주입이 불가능하다. (중요)**