이번에는 예외를 상세하게 구분하기 
원래는
부적절한 인수를 전달했을때의 IllegalArgumentException만 사용하였는데 
부적절한 타이밍에 호출되었을때인 IllegalStatementException도 학습하여 사용하였다.

그리고 지난번에는 클래스를 필요할때마다 구현해서 개발하면서 함수들의 위치가 헷갈렸는데
이번에는 미리 어떤 함수를 만들것이고 어떤클래스에있을지를 설계를 먼저해보고자했다.

MVC를 기반으로 설계를 하려고하는데 웹에서 정형화되어있던 service,domain와 다르게 
어디까지가 view고 controller인지 구분하는게 조금 애매하게느껴져서 다른 분들의 코드를 많이 찾아봤다.

Model // 종속되지않아야한다.
- Enum : 위칸/아래칸
- Enum : 재시작/종료
  View
- startInput()
    - makeBridge()
    - moveRound()
    - choiceRestart()
    - showBridge()
Controller
    - resultBridge()

짜고나서 보니까 이번주차는 기본적인 틀도 주어졌다.
내가 생각한 구조가 맞는지 확인해볼기회가 되어서 더 좋았다.
input과 output을 다른 클래스로 구분하는 점이 달랐고,
ENUM타입이 없다는 점이 달랐다.
하지만 주어진 상황에서는 ENUM을 쓰지않아서 쓰지 않기로했고
대신에 generate()라는 함수를 interface로 제공한 이유에 대해서 공부하였다.

