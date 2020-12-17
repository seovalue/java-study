# 더 자바, Java 8
소스코드: https://github.com/seovalue/java-study/tree/main/src/thejava

## 함수형 인터페이스와 람다
인터페이스에 추상 메서드가 **하나**만 있으면 함수형 인터페이스이다. 다른 형태의 메서드가 있는 것은 관계없이, 추상 메서드의 
개수가 하나인 것만 중요하다.
인터페이스에서는 `abstract`, `static`, `public` 키워드를 생략할 수 있다.  
  
  
또한, 함수형 인터페이스를 구현할 때, 람다 표현식을 통해 코드를 줄일 수 있다.
- 코드 줄이기 전  
```
RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("hi");
            }
        };
```

- 코드 줄인 후  
```
RunSomething runSomething = () -> System.out.println("hi");
```
  
함수형 프로그래밍을 할 때에는 순수함수의 형태로 구현할 수 있을 때 함수형 프로그래밍으로 구현해야한다.  
`함수 밖에 있는 값을 변경하지 않음`, `같은 입력 값에 대해서 같은 출력 값을 보장함`  

### Java가 기본으로 제공하는 함수형 인터페이스
- java.util.funcation 패키지
- 자바에서 미리 정의해둔 자주 사용할만한 함수 인터페이스
- Function<T, R>
- BiFunction<T, U, R>
- Consumer<T>
- Supplier<T>
- Predicate<T>
- UnaryOperator<T>
- BinaryOperator<T>

- Function<T, R>
T 타입을 받아서 R 타입을 리턴하는 함수 인터페이스
- R apply(T t)
함수 조합용 메소드
andThen
compose

- BiFunction<T, U, R>
두 개의 값(T, U)를 받아서 R 타입을 리턴하는 함수 인터페이스
R apply(T t, U u)

- Consumer<T>
T 타입을 받아서 아무값도 리턴하지 않는 함수 인터페이스
void Accept(T t)
함수 조합용 메소드
andThen

- Supplier<T>
T 타입의 값을 제공하는 함수 인터페이스
T get()

- Predicate<T>
T 타입을 받아서 boolean을 리턴하는 함수 인터페이스
boolean test(T t)
함수 조합용 메소드
And
Or
Negate

- UnaryOperator<T>
Function<T, R>의 특수한 형태로, 입력값 하나를 받아서 동일한 타입을 리턴하는 함수 인터페이스

- BinaryOperator<T>
BiFunction<T, U, R>의 특수한 형태로, 동일한 타입의 입렵값 두개를 받아 리턴하는 함수 인터페이스

### 람다 표현식
* 변수 캡쳐  
로컬 변수 캡쳐는 `final`이거나 `effective final`인 경우에만 참조할 수 있다.  

### 쉐도잉?  
어떤 클래스를 정의하고 변수 `name`를 정의했다고 했을 때, 그 안에 만든 어떤 메소드안에 또 `name`을 정의했다고 하면
뒤의 `name`은 가려진다.  
코드에서 보면 Foo안의 Run안의 익명클래스, 로컬클래스, 람다가 있다. 이 중에서 익명클래스와 로컬클래스는 쉐도잉이 되지만 
람다는 쉐도잉이 안된다. 이유는 익명클래스와 로컬클래스는 클래스 만큼의 스코프를 가지지만 람다는 run과 동일한 만큼의 스코프를 가지기 때문. 
따라서 같은 scope안에 동일한 변수 명을 사용할 수 없다!!  

## 인터페이스의 변화
### 인터페이스 기본 메소드와 스태틱 메소드
모든 하위 클래스가 이 메소드를 사용할 수 있게 하기 위해 인터페이스에 새로운 메소드를 추가하면 인페이스를 implements한 모든 클래스에서 오류가 발생한다.  
이럴 때엔, `default` 키워드를 사용하여 특정한 기능을 인터페이스에서 제공할 수 있다. `default` 메소드는 구현체에서 재정의도 가능하다. 
단, `Object`에서 제공하는 메소드들은 선언은 가능하나 `default`로 재정의하는 것은 불가능하다.  

두 인터페이스에서 동일한 `default` 메소드를 제공할 때, 이 두 인터페이스를 모두 구현하는 Class에 경우에는 
해당 `default` 메소드에 대해 재정의해주어야한다.  

해당 타입 관련 헬퍼 또는 유틸리티 메소드를 제공할 때 인터페이스에 스태틱 메소드를 제공할 수 있다.

### 자바 8 API의 기본 메소드와 스태틱 메소드
자바 8에서 추가한 기본 메소드로 인한 API 변화
```
Iterable의 기본 메소드
forEach()
spliterator()

Collection의 기본 메소드
stream() / parallelStream()
removeIf(Predicate)
spliterator()

Comparator의 기본 메소드 및 스태틱 메소드
reversed()
thenComparing()
static reverseOrder() / naturalOrder()
static nullsFirst() / nullsLast()
static comparing()
```


### Stream
- 데이터를 담는 저장소가 아니다.  
- 스트림이 처리하는 데이터 소스를 변경하지 않는다.  
- 스트림으로 처리하는 데이터는 오직 한번만 처리한다.  
