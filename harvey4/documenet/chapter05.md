5장 싱글톤 패턴

객체 하나만 생성 & 어디서든 참조 가능

생성 방법
private 생성자 / instance 제공 static 메소드 => 객체 외부에서 생성 금지 & 내부에서만 생성하게끔

```
public class Singleton {
    private static Singleton singleton;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (singleton == null) {
            this.singleton = new Singleton();
        }
        return this.singleton;
    }
}
```


위 코드의 문제점 
=> 멀티 쓰레드 환경에서 null 체크 후 생성 부분에서  
    동시 접근시 객체 여러개 생성 가능 

해결 방법
1. synchronized 사용
2. instance 정의시 생성


kotlin 싱글톤 
object - 생성자 불가
companion object -> java static 
anoymous object -> 새로운 인스턴스 생성 // (object: A { … } )
