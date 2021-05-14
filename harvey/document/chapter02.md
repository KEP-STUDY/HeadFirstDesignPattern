
2장 옵저버 패턴

Observable 패턴

객체(A)가 다른 객체(B,C,D..)에 이벤트 전파
- 객체 B,C,D 입장에선 객체 A가 변하면 자동 이벤트 들어옴
- 클라에선 대부분이 observable 패턴 -> api, db 등을 view에서 observing 함(Rx, liveData)

생각 해본 예제 코드의 문제점(P. 96~97)
- @override 있어야 하는거 아닌가?
- temperature, humidity를 전역변수로 안두고 display()시 param으로 넘기는게 좋지 않나?
- observer register시도 notify 해야지 않나?
  이벤트가 온후 observing하는 객체는 이벤트가 update가 안됨
-  setMeasure(temp, pressure, humidity) 를 각각으로 나눠야 하는거 아닌가?
   안 변한 데이터도 보내줘야하며, 각 데이터가 클 경우 overhead가 심함

JAVA 내장 옵저버
- observable에서 add, remove, notify 제공
- setChange 값으로 notify 조절 가능

Observable 패턴 주의 사항
- 순서에 의존 코드 사용x (ex. currentTemperature += 3)
