# 오브젝트
소스코드: https://github.com/seovalue/java-study/tree/main/src/book
## Chapter01
### step01
**예상을 빗나가는 코드**  
`Theater` 클래스의 `enter` 메서드가 수행하는 일을 말로 풀어보자.  
> 소극장은 관람객의 가방을 열어 그 안에 초대장이 들어있는지 살펴본다. 가방 안에 초대장이 있다면 판매원은
>매표소에 보관돼 있는 티켓을 관람객의 가방 안으로 옮긴다. 가방 안에 초대장이 들어 있지 않다면 관람객의 가방에서
>티켓 금액만큼의 현금을 꺼내 매표소에 적립한 후 매표소에 보관돼 있는 티켓을 관람객의 가방 안으로 옮긴다.  

문제 1. 관람객과 판매원이 소극장의 통제를 받는 수동적인 존재이다.  
문제 2. 코드를 이해하기 위해서는 여러 가지 세부적인 내용들을 한꺼번에 기억하고 있어야 한다.  
문제 3. `Audience`와 `TicketSeller`를 변경할 경우 `Theater`도 변경해야한다.

> 결합도가 높고 의존성이 높다.

![](img/너무%20많은%20클래스에%20의존하는%20Theater.png)  

### step02
* 해결 방법  
- `Audience`와 `TicketSeller`가 직접 `Bag`와 `TicketOffice`를 처리하는 자율적인 존재가 되도록 설계를 변경한다.  
1. `Theater`의 `enter` 메서드에서 `TicketOffice`에 접근하는 모든 코드를 `TicketSeller` 내부로 숨긴다.
2. `TicketSeller`에서 `getTicketOffice` 메서드를 제거한다. `ticketOffice`의 가시성이 private이고 접근 가능한 퍼블릭 메서드가 더 이상 존재하지 않기 때문에 
외부에서는 `ticketOffice`에 직접 접근할 수 없다. 결과적으로 `ticketOffice`는 `ticketSeller`만이 접근할 수 있다.  >> **캡슐화**  
3. `TicketSeller` 에서 `Audience`의 `Bag`에 접근하는 메서드를 변경한다. `Audience`에서 직접 `Bag`을 관리하도록 한다.  
4. `Bag`을 자율적인 존재로 바꾼다. 위와 동일한 과정을 통해 캡슐화한다.

> 데이터와 프로세스가 동일한 모듈 내부에 위치하도록 프로그래밍. OOP

![](img/step02.png)  

