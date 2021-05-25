4장 팩토리 패턴

객체 생성 부분을 나누며 생성 부분이 자주 바뀔수 있다면 사용하면 좋음

- 팩토리 패턴
  객체 생성 부분과 사용부분을 분리
  객체 생성 부분 -> Factory
  패턴이라 하기 애매함..


- 팩토리 메소드 패턴
  객체 생성 부분을 서브클래스에서 결정하도록 함
  pizzaStore - abstract fun createPizza
  NYpizzaStore extend pizzaStore - override fun createPizza

- 추상 팩토리 패턴: 제품군을 생성하기 위한 인터페이스를 생성 그 인터페이스를 구성하여 사용할수 있게끔 하는것.
  단점 제품을 추가하기 위해선 interface를 변경 / createBacon
  장점 제품들을 하나로 묶는 장점 / createDough, createSuace ..  
  팩토리 메소드 vs 추상 팩토리
  클래스 / interface
  상속 / 구성

질문
추상 팩토리에서 팩토리 메소드 사용하는 경우?
어디까지 팩토리 패턴을 적용하는게 맞나? new ThinDough 요런것도 추상 팩토리 패턴 적용? 	public Dough createDough() {
return new ThinCrustdough();
}