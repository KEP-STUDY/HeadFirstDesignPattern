eal Object에 대해서 실제로 필요할 때 instance가 생성되고 실제 작업이 진행될 수 있도록 하기 위해 적용되는 패턴

**데코레이터(Decorator)**데코레이터 패턴은 runtime에 real Object에 기능을 확장하고 싶을 때 사용

### 좀더 간단하게

**프록시** : 대신한다.

**데코레이터** : 합쳐서 한다.

## 다이나믹 프록시

자바에서 지원해주는 프록시 객체

런타임시 특정 객체를 생성해서 프록시의 용도로 사용 할 수 있다.

### 기본 구성

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9a8d12e9-4647-49b6-85ee-9733576a4794/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9a8d12e9-4647-49b6-85ee-9733576a4794/Untitled.png)

### 사용예제 1 (네트워크 리퀘스트)

예제 : 서로다른 페이즈에서 네트워크 콜을 할건데 앞에 url을 다르게 해주고싶다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dcfe4099-cfd6-48a7-8695-0d5385be5512/_2021-07-04__7.17.09.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dcfe4099-cfd6-48a7-8695-0d5385be5512/_2021-07-04__7.17.09.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/48976e63-0536-43d5-ab6d-e5600d66cc4c/_2021-07-04__7.27.08.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/48976e63-0536-43d5-ab6d-e5600d66cc4c/_2021-07-04__7.27.08.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6ef97b58-3bc4-43fe-a42b-f470e89a747c/_2021-07-04__7.18.34.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6ef97b58-3bc4-43fe-a42b-f470e89a747c/_2021-07-04__7.18.34.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/310869a2-7643-4488-9eb3-1fb9662d1de4/_2021-07-04__7.18.21.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/310869a2-7643-4488-9eb3-1fb9662d1de4/_2021-07-04__7.18.21.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/115e0f2d-ffb4-41e4-9e24-12a3d496a764/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/115e0f2d-ffb4-41e4-9e24-12a3d496a764/Untitled.png)

### 사용예제 2 (네트워크 리스폰스)

예제 : 데이터를 받아와서 특정 자료구조에 맵핑해서 반환하고 싶다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/75f982c7-a62a-47df-b6ae-5d9610486bcc/_2021-07-04__7.27.35.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/75f982c7-a62a-47df-b6ae-5d9610486bcc/_2021-07-04__7.27.35.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f83fbc7f-a394-4e5a-952c-e4385af02f58/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f83fbc7f-a394-4e5a-952c-e4385af02f58/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8f8b3145-33ea-464b-af35-68943e4dc5fe/_2021-07-04__7.28.18.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8f8b3145-33ea-464b-af35-68943e4dc5fe/_2021-07-04__7.28.18.png)
