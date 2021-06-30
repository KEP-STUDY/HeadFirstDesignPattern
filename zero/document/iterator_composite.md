### 왜 쓸까?

Iterator : 서로다른 자료구조를 추상화하여 접근할 수 있도록 하기위해

Composite : 클라이언트 작업 단순화 → 메소드호출하면 트리구조로 반복 동작
(안드로이드 View - ViewGroup 구조)

[iterator vs sequence](https://www.notion.so/Iterator-vs-Sequence-47824e7667ab4258a7c048d7a32316ca)

### 외부반복자 vs 내부반복자

- 외부반복자 → 우리가 아는것 
(직접 돌린다)

```java
List<String> list  = Arrays.asList("앙", "기무치");
Iterator<String> iterator = list.iterator();

while(iterator.hasNext()){
     String name = iterator.next();
     System.out.println(name);
}
```

- 내부반복자 → 컬렉션 내부의 요소들을 반복시키고, 개발자는 요소당 처리해야 할 코드만 제공 
(돌릴 때 실행할 코드만 제공한다.)

```java
List<String> list  = Arrays.asList("앙", "기무치");
Stream<String> stream = list.stream();

stream.forEach(name -> System.out.println(name)); // 매개 값에 람다식을 사용
```
