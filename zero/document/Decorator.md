# Decorator

객체에 새로운 임무를 부여할 수 있음.

## 크게 세가지

1. 컴포넌트 (최상위 인터페이스)
2. 구체 컴포넌트 (일반적인 행동을 정의할 것)
3. 데코레이터 (구체 컴포넌트 + 추가기능 할 것)

![https://blog.kakaocdn.net/dn/bnP6V5/btq1JVdeaQb/0DLKqgOGPfhb2qhfZmKWRk/img.png](https://blog.kakaocdn.net/dn/bnP6V5/btq1JVdeaQb/0DLKqgOGPfhb2qhfZmKWRk/img.png)

딜리게이터? 데코레이터?

## 딜리게이터?

- delegate : 위임하다
- 결국 자기 기능을 다른놈한테 주는것

```kotlin
interface Component {
    fun delegate()
}
class Decorator(private val component: Component) : Component {
    override fun delegate() {
        component.delegate()
        println("딜리게이트가 되었구나!")
    }
}
fun main() {
    val concrete = Decorator(object :Component{
        override fun delegate() {
            println("딜리게이트 될 대상")
        }
    })
    concrete.delegate()
}
//Before
class Decorator(private val component: Component) : Component {
    override fun delegate() {
        component.delegate()
    }
}
//After (kotlin 언어 지원)
class Decorator(private val component: Component) : Component by component
//java로 디컴파일
public final class Decorator implements Component {
   private final Component component;

   public Decorator(@NotNull Component component) {
      Intrinsics.checkNotNullParameter(component, "component");
      super();
      this.component = component;
   }

   public void delegate() {
      this.component.delegate();
   }
}
```

### 질문사항들...

1. by lazy의 by 또한 딜리게이터인가? 이해가 잘 안되는데 lazy 초기화에서는 딜리게이터?
2. ReadWriteProperty 잘 설명해주 실 수 있는분?ㅠ_ㅠ...