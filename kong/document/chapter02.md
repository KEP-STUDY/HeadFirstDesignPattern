# Observer Pattern

---

## 옵져버 패턴이란?

### 옵저버 패턴에서는 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들에게 연락이 가고, 자동으로 내용이 갱신되는 방식으로 일대 다(one-to-many)의존성을 정의한다

![](https://t1.daumcdn.net/cfile/tistory/994F67435C66164C36)
---

## 옵져버 패턴의 장점

### 느슨한 결합

---

## 느슨한 결합

1. 주제와 옵저버는 interface를 통해 통신하다
1. 옵저버는 추가 및 삭제가 가능하다
1. 새로운 형식의 옵저버를 추가하더라도 주제는 변경이 필요하지 않다
1. 주제와 옵저버는 독립적이므로 재사용및 수정이 용이하다

![](https://t1.daumcdn.net/cfile/tistory/994F67435C66164C36)

---

## 옵져버 패턴의 종류

1. Pull 방식

   주제가 일방적으로 옵저버에게 통보만 가능한 방식
   ![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbA9CKW%2FbtqDaVg5Nrg%2FkmPeUcs7qWjEFkuWvNbHu0%2Fimg.jpg)

---

2. Poll 방식 (Java 내장 Observer)

   옵저버가 직접 주제로부터 데이터를 가져오는 방식
   ![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbzmRrt%2FbtqC9Opgdtj%2F17BcJ57s4DPs940WHLw1qK%2Fimg.jpg)

   다만 java.util Observer 는 deprecated
   [링크](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Observable.html)

---

## 왜 java.util observer 는 deprecated 되었나?

1. Observable이 interface가 아니라 class이다.
    - 인터페이스에 맞춰 프로그래밍한다는 객체지향 디자인 원칙을 위배한다.
    - 이미 다른 클래스를 상속하는 클래스가 Observable을 상속할 수 없다.
1. notify가 순서를 보장하지 않는다
1. 더 풍부한 이벤트 모델은 java.beans 패키지가 제공하고 있다.