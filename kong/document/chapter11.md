# Proxy Pattern

## 프록시 의 단점

1. 매 번 새로운 클래스 정의 필요.
2. 타깃 인터페이스를 구현하고 위임하는 코드 필요
3. 부가기능 코드의 중복

## Dynamic Proxy

- 런타임에 동적으로 만들어지는 오브젝트
- 리플렉션 이용
- 타깃 인터 페이스와 동일한 형태
- FactoryBean 사용

### JDK Dynamic Proxy

```java
Object proxy=Proxy.newProxyInstance(ClassLoader       // 클래스로더
        ,Class<?>[]        // 타깃의 인터페이스
        ,InvocationHandler // 타깃의 정보가 포함된 Handler
        );
```

![](https://gmoon92.github.io/md/img/aop/jdk-dynamic-proxy-and-cglib/jdk-dynamic-proxy1.png)

### 인터페이스 기준

``` java
public Object invoke(Object proxy,Method proxyMethod,Object[]args)throws Throwable{
        Method targetMethod=null;
        // 주입된 타깃 객체에 대한 검증 코드
        if(!cachedMethodMap.containsKey(proxyMethod)){
            targetMethod=target.getClass().getMethod(proxyMethod.getName(),proxyMethod.getParameterTypes());
            cachedMethodMap.put(proxyMethod,targetMethod);
        } else {
            targetMethod=cachedMethodMap.get(proxyMethod);
        }

        // 타깃의 메소드 실행
        Ojbect retVal=targetMethod.invoke(target,args);
        return retVal;
}

```

![](https://gmoon92.github.io/md/img/aop/jdk-dynamic-proxy-and-cglib/jdk-dynamic-proxy2.png)

### CGLib

``` java
Enhancer enhancer=new Enhancer();
enhancer.setSuperclass(MemberService.class); // 타깃 클래스
enhancer.setCallback(MethodInterceptor);     // Handler
Object proxy=enhancer.create(); // Proxy 생성
```

![](https://gmoon92.github.io/md/img/aop/jdk-dynamic-proxy-and-cglib/cglib1.png)