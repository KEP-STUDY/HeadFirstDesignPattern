6.장 커멘드 패턴
요구 사항 캡슐화

커맨드 패턴
￼

	- 클라이언트 : 손님
	- 커맨드 객체 : 주문서
	- 인보커 : 종업원
	- 리시버 : 주방장 
	- 인보커에 커맨드 지정: 주문
	- 인보커가 커맨드 실행: 주방장에 주문 요청 


메타 커맨드 패턴  
커맨드 패턴 확장 - 여러개 커맨드를 수행(매크로) , undo

3. Undo
    1. 커멘드 객체에  undo()구현  커멘드와 반대되는것 구현
       ￼
4. invoker가 커맨드를 수행할때.

    -  undoCommand에 해당 커맨드 저장
    -  undo시 invocker는 undoCommand.undo()수행
    -  ? undoCommand보다 lastCommand가 낫지 않나?

￼
￼
4. 매크로 커맨드

    - 하나의 인보커에 여러 커맨드
    - 하나의 커맨드에 여러 커맨드

고찰
1. 주문이 하나면 굳이 invoker가 필요할까? - 클라이언트가 command.excute() 
