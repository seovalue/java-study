# 기능요구사항
## Goal: 숫자야구게임 - 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임

1. 컴퓨터는 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 만든다.
2. 사용자는 3자리의 숫자를 입력하고, 컴퓨터의 숫자와 비교하여 같은 수가 같은 자리에 있으면 스트라이크, 다른자리에 있으면 볼, 같은 수가 전혀 없으면 포볼(낫싱)을 출력해준다.
3. 사용자가 숫자를 맞출때까지 해당 기능을 반복한다.
4. 사용자가 숫자를 맞췄을 시 게임을 다시 시작하거나, 완전히 종료할 수 있다.

<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FuctEO%2FbtqulC36fjs%2FlnolkAkfaUsg5NU9edmHM0%2Fimg.png" width="400px">

## 프로그래밍 요구 사항
1. 자바 코드 컨벤션을 지키면서 프로그래밍한다.
ref: https://myeonguni.tistory.com/1596
2. indent(들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지 허용한다.
 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
3. 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.