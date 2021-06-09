# 왜 쓸까?

- 요청과 명령을 분리할 수 있다.
- 요청 → (객체마다의 행동) 실행

난 버튼(action)을 누르면 알아서 지정된 명령(command)를 실행해!

**Command(명령) 를 추상화하여 Controller에서 명령을 호출하도록**

# ❓

커멘드패턴 → strategy 패턴 비슷해보이지 않나?

나만 그렇게 생각한게 아님 ㅋ [link](https://stackoverflow.com/questions/4834979/difference-between-strategy-pattern-and-command-pattern)

### 목적이 다르다

**command :** 다른 목적을 가지고 사용한다. → 액션 체인지(what)
(CutCommand, DeleteCommand, CopyCommand, SortCommand)

**strategy :** 같은 목적을 가지고 다른 접근을 한다.  → 알고리즘 체인지(how)
(BubbleSort, SelectionSort, QuickSort)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b6e59f89-9c6e-4d77-953e-b853db644e58/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b6e59f89-9c6e-4d77-953e-b853db644e58/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/62fe97af-35a4-4a17-a86f-d37cb74821eb/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/62fe97af-35a4-4a17-a86f-d37cb74821eb/Untitled.png)
