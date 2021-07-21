8. 템플릿 메서드 패턴

- 로직을 추상화

primitivie 메서드 - concrete class 별로 로직이 다른 부분
hooker 메서드 - 있어도 되고 없어도 되고


할리우드 원칙
저수준 > 고수준 호출x
wallMessageViewModel은 할리우드 원칙 위배?
feedViewModel(저수준) > WallMessageViewModel.refreshMessage() (고수준) 사용

(책 - 이러한 경우는 빈번 but 상호 의존성 안생기게..?)
그럼 어떻게 수정 방안은?
답: fragment에서  val viewModel: WallMessageViewModel = FeedViewModel()
viewModel.refresh() 를 호출하도록 (dip로 수행됨) > mvvm은...…?

고수준 구성요소 - 추상
저수준 구성요소 - 서브

Array.sort(Object[])
Array의 sort는  Object가 Comparable interface 구현 하고 있어야함
즉 꼭 상속이 아니더라도 불안전한 알고리즘을 불완전한 알고리즘을 다른 클래스에서 제공하면 템플릿 메소드


strategy vs template method
구성 / 상속
동적으로 로직 변경이 필요할때 / 아닐 때
서브 클래스 n개에서 일정 동일한 로직들이 있을때 / 서브 클래스마다 다를때

드는 생각 > 상속이 하나라면?  구성 보다 상속이 더 깔끔한것 같기도 - 구성이 항상 좋은건 아닌것 같기도..
wallMessageViewModel를 strategy 패턴으로 구성했다면 > 코드가 더 복잡해질듯..
