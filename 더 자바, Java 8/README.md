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
